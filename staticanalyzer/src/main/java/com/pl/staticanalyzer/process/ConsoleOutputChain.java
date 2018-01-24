package com.pl.staticanalyzer.process;

import com.pl.staticanalyzer.output.Output;

public class ConsoleOutputChain implements GlobalChain {

    private GlobalChain globalChain;
    private Output output;

    @Override
    public void setNextChain(GlobalChain nextChain) {
        this.globalChain = nextChain;
    }

    @Override
    public void process() {
        output = new Output();
        output.writeOnConsole();
        // this.globalChain.process();
    }
}
