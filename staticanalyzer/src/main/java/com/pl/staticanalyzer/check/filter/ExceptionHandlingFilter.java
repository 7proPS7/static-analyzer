package com.pl.staticanalyzer.check.filter;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.report.Report;

class ExceptionHandlingFilter implements Filter {
    private final FileContent content;
    private final Report report;

    ExceptionHandlingFilter(FileContent content, Report report) {
        this.content = content;
        this.report = report;
    }

    @Override
    public void filter() {
        if (isSomeException(content)) {
            report.addError("EXCEPTION is throw");
        }
    }

    private boolean isSomeException(FileContent content) {
        return true;
    }
}
