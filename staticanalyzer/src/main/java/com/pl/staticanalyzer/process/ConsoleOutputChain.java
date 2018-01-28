package com.pl.staticanalyzer.process;

import com.pl.staticanalyzer.output.Output;
import com.pl.staticanalyzer.report.Report;

public class ConsoleOutputChain implements GlobalChain {
    private GlobalChain globalChain;

    @Override
    public void setNextChain(GlobalChain nextChain) {
        this.globalChain = nextChain;
    }

    @Override
    public void process(Object obj) {
        if (obj instanceof Report) {
            Output output = new Output((Report) obj);
            output.writeOnConsole();
        }
    }
}
