package com.pl.staticanalyzer.converter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FileLoaderTest {
    private static final String DUMMY_FILE_PATH = "dummyFilePath";
    private static final String REAL_FILE_PATH = "G:\\static-analyzer\\staticanalyzer\\src\\main\\resources\\Student.java";

    private FileLoader fileLoader;

    @Before
    public void setUp() {
        fileLoader = new FileLoader();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfFileIsNotFound() {
        FileLoader.load(DUMMY_FILE_PATH);
    }

    @Test
    public void shouldWriteLineByLineFromFile() {
        FileLoader.load(REAL_FILE_PATH);
    }
}