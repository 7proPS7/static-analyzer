package com.pl.staticanalyzer.converter;

import com.pl.staticanalyzer.api.FileContent;

import java.io.File;

public interface Convertable {
    void convert(FileContent fileContent);
}
