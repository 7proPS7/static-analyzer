package com.pl.staticanalyzer.raport.message;

public class ClassBodyMessage {
    private int keyWord;
    private FieldMessage fieldMessage;
    private MethodMessage methodMessage;

    public ClassBodyMessage(int keyWord, FieldMessage fieldMessage, MethodMessage methodMessage) {
        this.keyWord = keyWord;
        this.fieldMessage = fieldMessage;
        this.methodMessage = methodMessage;
    }

    public int getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(int keyWord) {
        this.keyWord = keyWord;
    }

    public FieldMessage getFieldMessage() {
        return fieldMessage;
    }

    public void setFieldMessage(FieldMessage fieldMessage) {
        this.fieldMessage = fieldMessage;
    }

    public MethodMessage getMethodMessage() {
        return methodMessage;
    }

    public void setMethodMessage(MethodMessage methodMessage) {
        this.methodMessage = methodMessage;
    }
}

