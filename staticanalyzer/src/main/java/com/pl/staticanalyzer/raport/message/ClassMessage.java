package com.pl.staticanalyzer.raport.message;

public class ClassMessage {
    private int access;
    private int keyWord;
    private int type;
    private ClassBodyMessage classBodyMessage;

    public ClassMessage(int access, int keyWord, int type, ClassBodyMessage classBodyMessage) {
        this.access = access;
        this.keyWord = keyWord;
        this.type = type;
        this.classBodyMessage = classBodyMessage;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public int getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(int keyWord) {
        this.keyWord = keyWord;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ClassBodyMessage getClassBodyMessage() {
        return classBodyMessage;
    }

    public void setClassBodyMessage(ClassBodyMessage classBodyMessage) {
        this.classBodyMessage = classBodyMessage;
    }
}
