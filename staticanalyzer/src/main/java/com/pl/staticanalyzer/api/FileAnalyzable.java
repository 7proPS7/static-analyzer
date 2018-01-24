package com.pl.staticanalyzer.api;

import java.util.List;

public interface FileAnalyzable {
    List<String> getAllContent();

    String getLine(int lineNumber);

    List<String> getLines(int fromLine, int toLine);

    long getSizeOfFile();

    String getLastLineOfFile();

    String getFirstLineOfFile();

    List<String> getFirstMethod();

    List<String> getLastMethod();

    String findAllPublicStaticFinalField();

    String findStaticBody();

    String findTryWithResources();

    String findTryWithCatchBlock();

    String findAllClasses();

    String findAllInterfaces();

    String findMethodBodyParameter();

    List<String> findAllReturnStatement();
}
