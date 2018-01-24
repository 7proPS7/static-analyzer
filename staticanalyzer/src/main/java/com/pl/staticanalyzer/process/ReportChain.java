package com.pl.staticanalyzer.process;

import com.pl.staticanalyzer.report.Report;

public class ReportChain implements GlobalChain {

    private GlobalChain globalChain;
    private Report report;

    @Override
    public void setNextChain(GlobalChain nextChain) {
        this.globalChain = nextChain;
    }

    @Override
    public void process() {
        Report report = new Report();
        report.addError("someErrorAdded");
        report.addError("someError2Added");
        report.addWarning("someWarningAdded");
        report.addWarning("someWarningAdded");
        this.globalChain.process();
    }
}
