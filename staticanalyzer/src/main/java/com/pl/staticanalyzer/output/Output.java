package com.pl.staticanalyzer.output;

import static com.pl.staticanalyzer.GlobalHashMap.map;
import static com.pl.staticanalyzer.report.ReportType.ERROR;
import static com.pl.staticanalyzer.report.ReportType.WARNING;

public class Output {

    public void writeOnConsole() {
        map.get(ERROR).forEach(val -> System.out.println("[" + ERROR + "] " + val));
        System.out.println();
        map.get(WARNING).forEach(val -> System.out.println("[" + WARNING + "] " + val));
        map.clear();
    }
}
