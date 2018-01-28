package com.pl.staticanalyzer;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.process.ChainFactory;

public class Main {
    private static final String REAL_FILE_NAME = "G:\\static-analyzer\\staticanalyzer\\src\\main\\resources\\Student.java";

    public static void main(String[] args) {
        FileContent fileContent = new FileContent(REAL_FILE_NAME);
        ChainFactory factory = new ChainFactory();
        factory.initProcess(fileContent);
    }
}
