package com.pl.staticanalyzer.process;

import java.util.logging.Logger;

public class ReportChain implements GlobalChain {

    private GlobalChain globalChain;

    public ReportChain(GlobalChain globalChain) {
        this.globalChain = globalChain;
    }

    @Override
    public void process() {
        Logger log = Logger.getLogger(ReportChain.class.getName());
        log.info("REPORT_CHAIN_PROCESS");

    }
}
