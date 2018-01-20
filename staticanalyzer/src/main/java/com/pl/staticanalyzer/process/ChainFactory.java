package com.pl.staticanalyzer.process;

public class ChainFactory {

    private final GlobalChain globalChain;

    public ChainFactory() {
        this.globalChain = createGlobalChain();
    }

    public GlobalChain createGlobalChain() {
        return new ConvertChain(new CheckChain(new ReportChain(new ConsoleOutputChain(this.globalChain))));
    }

    public void initProcess() {
        globalChain.process();
    }
}
