package com.pl.staticanalyzer.process;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.report.Report;

public class ChainFactory {

    private GlobalChain convert;
    private FileContent content;
    private Report reports;



    public ChainFactory(FileContent content, Report reports) {
        this.convert = new ParserChain();
        CheckChain check = new CheckChain(content,reports);
        ReportChain report = new ReportChain();
        ConsoleOutputChain console = new ConsoleOutputChain();

        convert.setNextChain(check);
        check.setNextChain(report);
        report.setNextChain(console);
    }

    public void initProcess() {
        this.convert.process();
    }

    public void initProcess(String filePath) {

    }
}
