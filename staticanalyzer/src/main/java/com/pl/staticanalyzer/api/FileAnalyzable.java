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

    List<String> findAllPublicStaticFinalField();

    List<String> findAllStaticBody();

    List<String> findAllTryWithResources();

    String findTryWithCatchBlock();

    List<String> findAllLineWithClasses();

    List<String> findAllLineWithInterfaces();

    String findMethodBodyParameter();

    List<String> findAllReturnStatement();
}
