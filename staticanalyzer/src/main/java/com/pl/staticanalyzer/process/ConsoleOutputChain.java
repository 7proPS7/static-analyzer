package com.pl.staticanalyzer.process;

import java.util.logging.Logger;

public class ConsoleOutputChain implements GlobalChain {
    private GlobalChain globalChain;

    public ConsoleOutputChain(GlobalChain globalChain) {
        this.globalChain = globalChain;
    }

    @Override
    public void process() {
        Logger log = Logger.getLogger(ConsoleOutputChain.class.getName());
        log.info("CONSOLE_OUTPUT_CHAIN_PROCESS");
        this.globalChain.process();
    }
}
