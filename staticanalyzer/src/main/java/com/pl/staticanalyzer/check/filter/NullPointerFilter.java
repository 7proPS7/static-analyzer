package com.pl.staticanalyzer.check.filter;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.report.Report;

class NullPointerFilter implements Filter {
    private final FileContent content;
    private final Report report;

    NullPointerFilter(FileContent content, Report report) {
        this.content = content;
        this.report = report;
    }

    @Override
    public void filter() {
        report.addWarning("PROBABLY NULL POINTER");
    }

    private boolean isNullPointer(FileContent content) {
        return content.getAllContent().contains("");
    }
}
