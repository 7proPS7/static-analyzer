package com.pl.staticanalyzer.api;

import java.util.List;
import java.util.stream.Collectors;

import static com.pl.staticanalyzer.api.FileLoader.load;
import static com.pl.staticanalyzer.constant.ConstantValue.*;

public class FileContent implements FileAnalyzable {


    public static final String TRY_WITH_RES = "try (";
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
    public List<String> findAllPublicStaticFinalField() {
        return getAllValueFor(PUBLIC_STATIC_FINAL);
    }

    @Override
    public List<String> findAllStaticBody() {
        return getAllValueFor(STATIC_BODY);
    }

    @Override
    public List<String> findAllTryWithResources() {
        return getAllValueFor(TRY_WITH_RES);
    }

    @Override
    public String findTryWithCatchBlock() {
        return null;
    }

    @Override
    public List<String> findAllLineWithClasses() {
        return getAllValueFor(CLASS);
    }

    @Override
    public List<String> findAllLineWithInterfaces() {
        return getAllValueFor(IMPLEMENTS);
    }

    @Override
    public String findMethodBodyParameter() {

        return null;
    }

    @Override
    public List<String> findAllReturnStatement() {
        return getAllValueFor(RETURN);
    }

    private List<String> getAllValueFor(String value) {
        return content.stream().filter(val -> val.contains(value)).collect(Collectors.toList());
    }

}
