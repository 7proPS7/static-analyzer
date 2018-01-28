package com.pl.staticanalyzer.api;

import java.util.List;

public class FileParser extends FileContent implements SinglePartAnalyzer {


    public FileParser(String fileName) {
        super(fileName);
    }

    @Override
    public String analyzingPublicStaticFinalField() {
        List<String> fields = findAllPublicStaticFinalField();
        return fields.get(0);
    }

    @Override
    public String analyzingStaticBody() {
        return findAllStaticBody().get(0);
    }

    @Override
    public String analyzingTryWithResources() {
        return findAllTryWithResources().get(0);
    }

    @Override
    public String analyzingTryWithCatchBlock() {
        return findTryWithCatchBlock();
    }

    @Override
    public String analyzingLineWithClasses() {
        return findAllLineWithClasses().get(0);
    }

    @Override
    public String analyzingLineWithInterfaces() {
        return findAllLineWithInterfaces().get(0);
    }

    @Override
    public String analyzingMethodBodyParameter() {
        return findMethodBodyParameter();
    }

    @Override
    public String analyzingReturnStatement() {
        return findAllReturnStatement().get(0);
    }
}
