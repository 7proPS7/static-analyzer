package com.pl.staticanalyzer.api;

public interface SinglePartAnalyzer {

    String analyzingPublicStaticFinalField();

    String analyzingStaticBody();

    String analyzingTryWithResources();

    String analyzingTryWithCatchBlock();

    String analyzingLineWithClasses();

    String analyzingLineWithInterfaces();

    String analyzingMethodBodyParameter();

    String analyzingReturnStatement();
}
