package com.pl.staticanalyzer.process;

import com.pl.staticanalyzer.api.FileContent;

public class ChainFactory {

    private GlobalChain convert;
    private FileContent content;

    public ChainFactory() {
        this.convert = new LoaderChain();
        CheckChain check = new CheckChain();
        ReportChain report = new ReportChain();
        ConsoleOutputChain console = new ConsoleOutputChain();

        convert.setNextChain(check);
        check.setNextChain(report);
        report.setNextChain(console);
    }

    public void initProcess(FileContent content) {
        this.convert.process(content);
    }
}
