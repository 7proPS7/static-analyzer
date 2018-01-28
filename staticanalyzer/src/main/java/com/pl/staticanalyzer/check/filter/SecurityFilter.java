package com.pl.staticanalyzer.check.filter;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.constant.ConstantValue;
import com.pl.staticanalyzer.report.Report;

import java.util.ArrayList;
import java.util.List;

class SecurityFilter implements Filter {
    private final FileContent content;
    private final Report report;
    private List<Integer> localizations;

    SecurityFilter(FileContent content, Report report) {
        this.content = content;
        this.report = report;
        localizations = new ArrayList<>();
    }

    @Override
    public void filter() {
        if (isPasswordVisible()) {
            report.addError("Password is visible for everyone");
        }
    }

    private List<Integer> findLocalizationsOfPassword() {
        content.findAllReturnStatement().forEach(val -> localizations.add(val.indexOf(ConstantValue.PASSWORD)));
        return localizations;
    }

    private boolean isPasswordVisible() {
        List<Integer> values = findLocalizationsOfPassword();
        Integer firstElem = localizations.get(0);

        for (int i = 1; i < localizations.size(); i++) {
            if (!firstElem.equals(localizations.get(i)))
                return true;
        }
        return false;
    }
}
