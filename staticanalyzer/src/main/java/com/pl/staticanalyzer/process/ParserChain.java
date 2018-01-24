package com.pl.staticanalyzer.process;

import com.pl.staticanalyzer.api.FileContent;

public class ParserChain implements GlobalChain {

    private GlobalChain globalChain;
    private FileContent content;
    @Override
    public void setNextChain(GlobalChain nextChain) {
        this.globalChain = nextChain;
    }

    @Override
    public void process() {
        this.globalChain.process();
    }
}
