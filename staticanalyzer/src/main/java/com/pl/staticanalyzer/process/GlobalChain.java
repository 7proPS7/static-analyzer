package com.pl.staticanalyzer.process;

public interface GlobalChain {
    void setNextChain(GlobalChain nextChain);

    void process();
}
