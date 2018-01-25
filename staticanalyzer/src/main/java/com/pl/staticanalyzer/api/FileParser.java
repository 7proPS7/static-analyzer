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
        return null;
    }

    @Override
    public String analyzingTryWithResources() {
        return null;
    }

    @Override
    public String analyzingTryWithCatchBlock() {
        return null;
    }

    @Override
    public String analyzingLineWithClasses() {
        return null;
    }

    @Override
    public String analyzingLineWithInterfaces() {
        return null;
    }

    @Override
    public String analyzingMethodBodyParameter() {
        return null;
    }

    @Override
    public String analyzingReturnStatement() {
        return null;
    }
}
