package com.pl.staticanalyzer.process;

import java.util.logging.Logger;

public class CheckChain implements GlobalChain {

    private GlobalChain globalChain;

    public CheckChain(GlobalChain globalChain) {
        this.globalChain = globalChain;
    }

    @Override
    public void process() {
        Logger log = Logger.getLogger(CheckChain.class.getName());
        log.info("CHECK_CHAIN_PROCESS");
        this.globalChain.process();
    }
}
