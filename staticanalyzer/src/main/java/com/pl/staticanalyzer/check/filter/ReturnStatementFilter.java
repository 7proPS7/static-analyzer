package com.pl.staticanalyzer.check.filter;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.constant.ConstantValue;
import com.pl.staticanalyzer.report.Report;

import java.util.ArrayList;
import java.util.List;

class ReturnStatementFilter implements Filter {
    private final FileContent content;
    private final Report report;

    ReturnStatementFilter(FileContent content, Report report) {
        this.content = content;
        this.report = report;
    }

    @Override
    public void filter() {
        if (isReturnStatementNotCorrect(content)) {
            report.addWarning("RETURN IN WRONG PLACE!");
        }
    }

    private List<Integer> localizations = new ArrayList<>();

    private List<Integer> findLocalizationsOfReturnStatement() {
        content.findAllReturnStatement().forEach(val -> localizations.add(val.indexOf(ConstantValue.RETURN)));
        return localizations;
    }

    private boolean isReturnStatementNotCorrect(FileContent content) {
        List<Integer> values = findLocalizationsOfReturnStatement();
        Integer firstElem = localizations.get(0);

        for (int i = 1; i < localizations.size(); i++) {
            if (!firstElem.equals(localizations.get(i)))
                return true;
        }
        return false;
    }
}
