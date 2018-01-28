package com.pl.staticanalyzer.process;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.check.filter.Filter;
import com.pl.staticanalyzer.check.filter.FilterFactory;
import com.pl.staticanalyzer.report.Report;

public class CheckChain implements GlobalChain {
    private GlobalChain globalChain;

    @Override
    public void setNextChain(GlobalChain nextChain) {
        this.globalChain = nextChain;
    }

    @Override
    public void process(Object obj) {
        Report report = new Report();
        if (obj instanceof FileContent) {
            FilterFactory factory = new FilterFactory((FileContent) obj, report);
            factory.getAllFilter().forEach(Filter::filter);
            this.globalChain.process(report);
        }
        this.globalChain.process(new CheckChain());
    }
}
