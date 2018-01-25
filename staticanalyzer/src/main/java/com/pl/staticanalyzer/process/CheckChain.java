package com.pl.staticanalyzer.process;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.check.filter.Filter;
import com.pl.staticanalyzer.check.filter.FilterFactory;
import com.pl.staticanalyzer.report.Report;

public class CheckChain implements GlobalChain {
    private FileContent content;
    private Report report;
    private GlobalChain globalChain;

    public CheckChain(FileContent content, Report report) {
        this.content = content;
        this.report = report;
    }

    @Override
    public void setNextChain(GlobalChain nextChain) {
        this.globalChain = nextChain;
    }

    @Override
    public void process() {
        FilterFactory factory = new FilterFactory(content, report);
        factory.getAllFilter().forEach(Filter::filter);

        this.globalChain.process();
    }
}
