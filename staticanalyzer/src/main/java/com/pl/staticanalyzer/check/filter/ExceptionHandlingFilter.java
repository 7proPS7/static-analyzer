package com.pl.staticanalyzer.check.filter;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.report.Report;

import java.util.List;

class ExceptionHandlingFilter implements Filter {
    private final FileContent content;
    private final Report report;

    ExceptionHandlingFilter(FileContent content, Report report) {
        this.content = content;
        this.report = report;
    }

    @Override
    public void filter() {
        List<String> exceptions = getExceptionLines(content);
        if (exceptions.size() > 0) {
            exceptions.forEach(val -> report.addError("EXCEPTION " + val.trim()));
        }
    }

    private List<String> getExceptionLines(FileContent content) {
        return content.findAllException();
    }
}
