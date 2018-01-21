package com.pl.staticanalyzer.api;

import java.util.List;

public interface FileAnalyzable {
    List<String> getAllContent();

    String getLine(int lineNumber);

    List<String> getLines(int fromLine, int toLine);

    long getSizeOfFile();

    String getLastLineOfFile();

    String getFirstLineOfFile();
}
