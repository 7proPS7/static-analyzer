package com.pl.staticanalyzer.api;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class FileContentTest {

    private static final String REAL_FILE_NAME = "G:\\static-analyzer\\staticanalyzer\\src\\main\\resources\\Student.java";
    private FileContent fileContent;

    @Before
    public void setUp() {
        fileContent = new FileContent(REAL_FILE_NAME);
    }

    @Test
    public void shouldCountFileSize() {
        assertThat(fileContent.getSizeOfFile()).isEqualTo(28L);
    }

    @Test
    public void shouldCheckIfgetLineMethodWotkCorrectly() {
        assertThat(fileContent.getLine(0)).isEqualTo("import java.io.Serializable;");
        assertThat(fileContent.getLine(1)).isBlank();
        assertThat(fileContent.getLine(2)).isEqualTo("public class Student implements Serializable {");
        System.out.println(fileContent.getLine(0));
    }

    @Test
    public void shouldReturnedAllLinesWithReturnStatements() {
        System.out.println(fileContent.findAllReturnStatement());
    }
}