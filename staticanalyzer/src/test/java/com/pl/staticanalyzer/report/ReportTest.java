package com.pl.staticanalyzer.report;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.pl.staticanalyzer.report.ReportType.ERROR;
import static com.pl.staticanalyzer.report.ReportType.WARNING;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class ReportTest {

    private Report report;

    @Before
    public void setUp() {
        report = new Report();
    }

    @Test
    public void shouldReturnedErrorsFromReportIfNotThenNull() {
        assertThat(report.get(WARNING).get(0)).isEqualTo("INITIAL_WARNING");

        report.addError("ERROR1");
        assertThat(report.get(ERROR).get(1)).isEqualTo("ERROR1");

        report.addError("ERROR2");
        assertThat(report.get(ERROR).get(2));
    }
}