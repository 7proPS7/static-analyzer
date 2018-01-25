package com.pl.staticanalyzer;

import com.pl.staticanalyzer.api.FileContent;
import com.pl.staticanalyzer.process.ChainFactory;
import com.pl.staticanalyzer.report.Report;

public class Main {
    private static final String REAL_FILE_NAME = "G:\\static-analyzer\\staticanalyzer\\src\\main\\resources\\Student.java";

    public static void main(String[] args) {
        FileContent fileContent = new FileContent(REAL_FILE_NAME);
        Report report = new Report();
        ChainFactory factory = new ChainFactory(fileContent, report);
        factory.initProcess();
    }
}
