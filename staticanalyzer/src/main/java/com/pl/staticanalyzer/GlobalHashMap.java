package com.pl.staticanalyzer;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.pl.staticanalyzer.report.ReportType;

public class GlobalHashMap {
    public static final Multimap<ReportType, String> reportMessages = ArrayListMultimap.create();
}
