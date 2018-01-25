package com.pl.staticanalyzer.check.filter;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.report.Report;

import static com.pl.staticanalyzer.constant.ConstantValue.CLOSE;

class ResourceReleaseFilter implements Filter {

    private final FileContent content;
    private final Report report;

    ResourceReleaseFilter(FileContent content, Report report) {
        this.content = content;
        this.report = report;

    }

    @Override
    public void filter() {
        if (isCloseMethodInvoke(content)) {
          report.addError("RESOURCE IS NEVER CLOSE!");
        }
    }

    private boolean isCloseMethodInvoke(FileContent content) {
        return content.getAllContent().contains(CLOSE);
    }

}
