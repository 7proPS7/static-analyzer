package com.pl.staticanalyzer.process;

import java.util.logging.Logger;

public class CheckChain implements GlobalChain {

    private GlobalChain globalChain;

    @Override
    public void setNextChain(GlobalChain nextChain) {
        this.globalChain = nextChain;
    }

    @Override
    public void process() {
        this.globalChain.process();
    }
}
