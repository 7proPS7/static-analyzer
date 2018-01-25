package com.pl.staticanalyzer.raport.message;

public class MethodMessage {
    private int access;
    private int keyWord;
    private int type;
    private Object parameters;
    private MethodBodyMessage methodBodyMessage;

    public MethodMessage(int access, int keyWord, int type, Object parameters, MethodBodyMessage methodBodyMessage) {
        this.access = access;
        this.keyWord = keyWord;
        this.type = type;
        this.parameters = parameters;
        this.methodBodyMessage = methodBodyMessage;
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

    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public MethodBodyMessage getMethodBodyMessage() {
        return methodBodyMessage;
    }

    public void setMethodBodyMessage(MethodBodyMessage methodBodyMessage) {
        this.methodBodyMessage = methodBodyMessage;
    }
}
