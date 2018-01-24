package com.pl.staticanalyzer.report;

import java.util.List;

import static com.pl.staticanalyzer.GlobalHashMap.map;
import static com.pl.staticanalyzer.report.ReportType.ERROR;
import static com.pl.staticanalyzer.report.ReportType.WARNING;

public class Report {

    public List<String> get(ReportType type) {
        return map.get(type);
    }

    public void addWarning(String value) {
        map.get(WARNING).add(value.trim());
    }

    public void addError(String value) {
        map.get(ERROR).add(value.trim());
    }
}
