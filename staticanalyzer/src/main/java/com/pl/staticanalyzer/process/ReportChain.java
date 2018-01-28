package com.pl.staticanalyzer.process;

import com.pl.staticanalyzer.raport.builder.Raport;
import com.pl.staticanalyzer.report.Report;

public class ReportChain implements GlobalChain {
    private GlobalChain globalChain;

    @Override
    public void setNextChain(GlobalChain nextChain) {
        this.globalChain = nextChain;
    }

    @Override
    public void process(Object obj) {
        Raport error = new Raport.Builder().withId(0).withName("ERROR").build();
        Raport warning = new Raport.Builder().withId(1).withName("WARNING").build();

        if (obj instanceof Report) {
            this.globalChain.process(obj);
        }
        this.globalChain.process(new ReportChain());
    }
}
