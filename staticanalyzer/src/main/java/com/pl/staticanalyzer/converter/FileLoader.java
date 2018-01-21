package com.pl.staticanalyzer.converter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileLoader {

    public static List<String> load(String filePath) {
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            return stream.collect(Collectors.toList());
        } catch (FileNotFoundException fne) {
            throw new IllegalArgumentException("File is not found", fne);
        } catch (IOException e) {
            throw new IllegalArgumentException("File is not close correctly", e);
        }
    }
}
