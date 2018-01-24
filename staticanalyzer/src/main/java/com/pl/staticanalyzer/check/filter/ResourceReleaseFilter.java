package com.pl.staticanalyzer.check.filter;

import java.util.List;

public class ResourceReleaseFilter implements Filter {

    private Filter filter;

    public ResourceReleaseFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public void filter(List<String> convertFile) {

    }

    private boolean isCloseMethodInvoke(List<String> convertFile) {

        //convertFile
        return true;
    }
}
