package com.pl.staticanalyzer.check.filter;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.report.Report;

import java.util.ArrayList;
import java.util.List;

public class FilterFactory {

    private final FileContent content;
    private final Report report;
    List<Filter> filters;

    public FilterFactory(FileContent content, Report report) {
        this.content = content;
        this.report = report;
        filters = new ArrayList<>();
    }

    public Filter getFilterByName(String filterName) {

        if (filterName.equals("ExceptionHandlingFilter")) {
            return new ExceptionHandlingFilter(content, report);
        }
        if (filterName.equals("NullPointerFilter")) {
            return new NullPointerFilter(content, report);
        }
        if (filterName.equals("SecurityFilter")) {
            return new SecurityFilter(content, report);
        }
        if (filterName.equals("ReturnStatementFilter")) {
            return new ReturnStatementFilter(content, report);
        }
        if (filterName.equals("ResourceReleaseFilter")) {
            return new ResourceReleaseFilter(content, report);
        }
        return null;
    }

    public List<Filter> getAllFilter() {
        filters.add(new ExceptionHandlingFilter(content, report));
        filters.add(new NullPointerFilter(content, report));
        filters.add(new SecurityFilter(content, report));
        filters.add(new ReturnStatementFilter(content, report));
        filters.add(new ResourceReleaseFilter(content, report));

        return filters;
    }
}
