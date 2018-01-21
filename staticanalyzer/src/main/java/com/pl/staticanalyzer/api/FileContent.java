package com.pl.staticanalyzer.api;

import java.util.List;

import static com.pl.staticanalyzer.converter.FileLoader.load;

public class FileContent implements FileAnalyzable {

    private List<String> content;

    public FileContent(final String fileName) {
        this.content = load(fileName);
    }

    @Override
    public List<String> getAllContent() {
        return content;
    }

    @Override
    public String getLine(int lineNumber) {
        if (lineNumber > content.size()) {
            throw new IllegalArgumentException("Line number is greater than size of file");
        } else {
            return content.get(lineNumber);
        }
    }

    @Override
    public List<String> getLines(int fromLine, int toLine) {
        if (fromLine >= 0 && toLine < content.size()) {
            return content.subList(fromLine, toLine);
        } else {
            throw new IllegalArgumentException("part between line not exist");
        }
    }

    @Override
    public long getSizeOfFile() {
        return content.size();
    }

    @Override
    public String getLastLineOfFile() {
        return content.get(content.size());
    }

    @Override
    public String getFirstLineOfFile() {
        return content.get(0);
    }
}
