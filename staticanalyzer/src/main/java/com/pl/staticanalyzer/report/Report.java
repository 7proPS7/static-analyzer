package com.pl.staticanalyzer.report;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;

import static com.pl.staticanalyzer.report.ReportType.ERROR;
import static com.pl.staticanalyzer.report.ReportType.WARNING;

public class Report {

    private final static Multimap<ReportType, String> reportMessages = ArrayListMultimap.create();

    public Collection<String> get(ReportType type) {
        return reportMessages.get(type);
    }

    public void addWarning(String value) {
        reportMessages.put(WARNING, value.trim());
    }

    public void addError(String value) {
        reportMessages.put(ERROR, value.trim());
    }

    public void clear() {
        reportMessages.clear();
    }
}
