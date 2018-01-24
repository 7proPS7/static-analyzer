package com.pl.staticanalyzer;

import com.pl.staticanalyzer.report.ReportType;

import java.util.*;

import static com.pl.staticanalyzer.report.ReportType.ERROR;
import static com.pl.staticanalyzer.report.ReportType.WARNING;

public class GlobalHashMap {
    public static final Map<ReportType, List<String>> map = new HashMap<>();

    static {
        map.put(ERROR, new ArrayList<>(Arrays.asList("=======INITIAL_ERROR=======")));
        map.put(WARNING, new ArrayList<>(Arrays.asList("=======INITIAL_WARNING=======")));
    }
}
