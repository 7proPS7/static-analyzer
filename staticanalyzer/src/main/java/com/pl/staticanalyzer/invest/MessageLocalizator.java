package com.pl.staticanalyzer.invest;

public class MessageLocalizator {

    private Integer rowNumber;
    private int colNumber;

    public MessageLocalizator(Integer rowNumber, int colNumber) {
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
