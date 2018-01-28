package com.pl.staticanalyzer.process;

public interface GlobalChain<T> {
    void setNextChain(GlobalChain nextChain);

    void process(T t);
}
