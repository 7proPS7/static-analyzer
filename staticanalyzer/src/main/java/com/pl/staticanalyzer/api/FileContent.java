package com.pl.staticanalyzer.api;

import java.util.List;
import java.util.stream.Collectors;

import static com.pl.staticanalyzer.api.FileLoader.load;

public class FileContent implements FileAnalyzable {

    private static final String RETURN = "return";
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

    @Override
    public List<String> getFirstMethod() {
        return content.subList(content.indexOf('('), content.indexOf(')'));
    }

    @Override
    public List<String> getLastMethod() {
        return content.subList(content.lastIndexOf('('), content.lastIndexOf(')'));
    }

    @Override
    public String findAllPublicStaticFinalField() {
        return null;
    }

    @Override
    public String findStaticBody() {
        return null;
    }

    @Override
    public String findTryWithResources() {
        return null;
    }

    @Override
    public String findTryWithCatchBlock() {
        return null;
    }

    @Override
    public String findAllClasses() {
        return null;
    }

    @Override
    public String findAllInterfaces() {
        return null;
    }

    @Override
    public String findMethodBodyParameter() {
        return null;
    }

    @Override
    public List<String> findAllReturnStatement() {
        return content.stream().filter(val -> val.contains(RETURN)).collect(Collectors.toList());
    }

}
