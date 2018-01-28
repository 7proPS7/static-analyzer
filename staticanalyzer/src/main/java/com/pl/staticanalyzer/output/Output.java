package com.pl.staticanalyzer.output;

import com.pl.staticanalyzer.report.ReportType;

import static com.pl.staticanalyzer.GlobalHashMap.reportMessages;
import static com.pl.staticanalyzer.report.ReportType.ERROR;
import static com.pl.staticanalyzer.report.ReportType.WARNING;

public class Output {
    public void writeOnConsole() {
        writeMessageByReportType(ERROR);
        writeMessageByReportType(WARNING);
        reportMessages.clear();
    }

    private void writeMessageByReportType(ReportType reportType) {
        reportMessages.get(reportType).forEach(val -> System.out.println("[" + ERROR + "] " + val));
    }
}
