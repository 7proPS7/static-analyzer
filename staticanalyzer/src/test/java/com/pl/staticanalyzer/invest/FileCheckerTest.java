package com.pl.staticanalyzer.invest;

import com.pl.staticanalyzer.api.FileContent;
import org.junit.Before;
import org.junit.Test;

public class FileCheckerTest {

    private static final String REAL_FILE_NAME = "G:\\static-analyzer\\staticanalyzer\\src\\main\\resources\\Student.java";

    private FileChecker fileChecker;

    @Before
    public void setUp() {
        fileChecker = new FileChecker();
    }

    @Test
    public void shouldCheckIfReturnStatementIsInTheSameLine() {
        FileContent fileContent = new FileContent(REAL_FILE_NAME);
        System.out.println(fileChecker.findLocalizationsOfReturnStatement(fileContent));
    }
}