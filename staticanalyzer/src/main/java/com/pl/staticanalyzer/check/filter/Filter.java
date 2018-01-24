package com.pl.staticanalyzer.check.filter;

import java.util.List;

public interface Filter {
    void filter(List<String> convertFile);
}
