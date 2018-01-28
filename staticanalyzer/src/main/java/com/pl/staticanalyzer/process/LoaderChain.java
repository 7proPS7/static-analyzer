package com.pl.staticanalyzer.process;

import com.pl.staticanalyzer.api.FileContent;

public class LoaderChain implements GlobalChain {

    private GlobalChain globalChain;

    @Override
    public void setNextChain(GlobalChain nextChain) {
        this.globalChain = nextChain;
    }

    @Override
    public void process(Object obj) {
        if (obj instanceof FileContent) {
            this.globalChain.process(obj);
        }
        this.globalChain.process(new LoaderChain());
    }
}
