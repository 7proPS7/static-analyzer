package com.pl.staticanalyzer.report;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.pl.staticanalyzer.report.ReportType.ERROR;
import static com.pl.staticanalyzer.report.ReportType.WARNING;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class ReportTest {
    private static final String SOME_ERROR_VALUE = "someErrorValue";
    private static final String SOME_ERROR_2_VALUE = "someError2Value";
    private static final String EMPTY_STRING = "";
    private static final String SOME_WARNING_VALUE = "someWarningValue";
    private static final String SOME_WARNING_2_VALUE = "someWarning2Value";

    private Report report;

    @Before
    public void setUp() {
        report = new Report();
    }

    private Object[] returnedValueCalculate() {
        return new Object[]{
                new Object[]{ERROR, SOME_ERROR_VALUE, new String[]{SOME_ERROR_VALUE}},
                new Object[]{ERROR, SOME_ERROR_2_VALUE, new String[]{SOME_ERROR_VALUE, SOME_ERROR_2_VALUE}},
                new Object[]{WARNING, SOME_WARNING_VALUE, new String[]{SOME_WARNING_VALUE}},
                new Object[]{WARNING, SOME_WARNING_2_VALUE, new String[]{SOME_WARNING_VALUE, SOME_WARNING_2_VALUE}}
        };
    }

    @Test
    @Parameters(method = "returnedValueCalculate")
    public void shouldReturnedValueByReportType(ReportType reportType, String insertedValue, String[] expectedValue) {

        if (reportType.equals(ERROR)) {
            report.addError(insertedValue);
        } else if (reportType.equals(WARNING)) {
            report.addWarning(insertedValue);
        }

        assertThat(report.get(reportType).toArray()).isEqualTo(expectedValue);
    }
}