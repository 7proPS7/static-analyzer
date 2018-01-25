package com.pl.staticanalyzer.process;

public class ParserChain implements GlobalChain {

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
