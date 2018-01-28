package com.pl.staticanalyzer.process;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.report.Report;

public class ChainFactory {

    private GlobalChain convert;
    private FileContent content;
    private Report reports;

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

    public void initProcess(String filePath) {

    }
}
