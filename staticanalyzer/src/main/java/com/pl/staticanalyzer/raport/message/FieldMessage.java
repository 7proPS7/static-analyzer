package com.pl.staticanalyzer.raport.message;

public class FieldMessage {
    private int access;
    private int keyWord;
    private int type;
    private int name;
    private Object initValue;

    public FieldMessage(int access, int keyWord, int type, int name, Object initValue) {
        this.access = access;
        this.keyWord = keyWord;
        this.type = type;
        this.name = name;
        this.initValue = initValue;
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

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Object getInitValue() {
        return initValue;
    }

    public void setInitValue(Object initValue) {
        this.initValue = initValue;
    }
}
