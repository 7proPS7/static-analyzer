package com.pl.staticanalyzer.output;

import com.pl.staticanalyzer.report.Report;
import org.junit.Before;
import org.junit.Test;

public class OutputTest {
    private Report report;
    private Output output;

    @Before
    public void setUp() {
        report = new Report();
    }

    @Test
    public void shouldReturnedAllErrorIfExist() {
        report.addError("Popelniono blad w 3 lini");
        report.addError("Popelniono blad w 4 lini");
        report.addError("Popelniono blad w 5 lini");
        report.addError("Popelniono blad w 6 lini");
        output = new Output(report);

        output.writeOnConsole();
    }

}