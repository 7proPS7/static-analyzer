package com.pl.staticanalyzer.process;

public class ChainFactory {

    private GlobalChain convert;

    public ChainFactory() {
        this.convert = new ParserChain();
        CheckChain check = new CheckChain();
        ReportChain report = new ReportChain();
        ConsoleOutputChain console = new ConsoleOutputChain();

        convert.setNextChain(check);
        check.setNextChain(report);
        report.setNextChain(console);
    }

    public void initProcess() {
        this.convert.process();
    }
}
