package com.pl.staticanalyzer.invest;

import com.pl.staticanalyzer.api.FileContent;

import java.util.ArrayList;
import java.util.List;

public class FileChecker {
    private static final String RETURN = "return";
    private List<Integer> localizations = new ArrayList<>();

    public List<Integer> findLocalizationsOfReturnStatement(FileContent content) {
        content.findAllReturnStatement().forEach(val -> localizations.add(val.indexOf(RETURN)));
        return localizations;
    }

    public boolean isReturnInWrongPlace(FileContent content) {
        List<Integer> integers = findLocalizationsOfReturnStatement(content);
        integers.sort(Integer::compareTo);
        //poprawic to!!!
        return false;
    }
}
