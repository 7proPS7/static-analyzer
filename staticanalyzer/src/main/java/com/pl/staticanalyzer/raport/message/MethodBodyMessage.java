package com.pl.staticanalyzer.raport.message;

import java.util.List;

public class MethodBodyMessage {
    private int metholdId;
    private int keyWord;
    private List<FieldMessage> fieldMessage;

    public MethodBodyMessage(int metholdId, int keyWord, List<FieldMessage> fieldMessage) {
        this.metholdId = metholdId;
        this.keyWord = keyWord;
        this.fieldMessage = fieldMessage;
    }

    public int getMetholdId() {
        return metholdId;
    }

    public void setMetholdId(int metholdId) {
        this.metholdId = metholdId;
    }

    public int getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(int keyWord) {
        this.keyWord = keyWord;
    }

    public List<FieldMessage> getFieldMessage() {
        return fieldMessage;
    }

    public void setFieldMessage(List<FieldMessage> fieldMessage) {
        this.fieldMessage = fieldMessage;
    }
}
