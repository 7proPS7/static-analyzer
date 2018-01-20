package com.pl.staticanalyzer.converter;

public class MessageLocalizator {

    private int rowNumber;
    private int colNumber;

    public MessageLocalizator(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getColNumber() {
        return colNumber;
    }
}
