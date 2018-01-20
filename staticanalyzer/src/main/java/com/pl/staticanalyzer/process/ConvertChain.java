package com.pl.staticanalyzer.process;

import java.util.logging.Logger;

public class ConvertChain implements GlobalChain {

    private GlobalChain globalChain;

    public ConvertChain(GlobalChain globalChain) {
        this.globalChain = globalChain;
    }

    @Override
    public void process() {
        Logger log = Logger.getLogger(ConvertChain.class.getName());
        log.info("CONVERT_CHAIN_PROCESS");
        this.globalChain.process();
    }
}
