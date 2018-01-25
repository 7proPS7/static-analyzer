package com.pl.staticanalyzer.raport.message;

public class InterfaceMessage {
    private int access;
    private int type;
    private ClassMessage classMessage;
    private MethodMessage methodMessage;
    private FieldMessage fieldMessage;

    public InterfaceMessage(int access, int type, ClassMessage classMessage, MethodMessage methodMessage, FieldMessage fieldMessage) {
        this.access = access;
        this.type = type;
        this.classMessage = classMessage;
        this.methodMessage = methodMessage;
        this.fieldMessage = fieldMessage;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ClassMessage getClassMessage() {
        return classMessage;
    }

    public void setClassMessage(ClassMessage classMessage) {
        this.classMessage = classMessage;
    }

    public MethodMessage getMethodMessage() {
        return methodMessage;
    }

    public void setMethodMessage(MethodMessage methodMessage) {
        this.methodMessage = methodMessage;
    }

    public FieldMessage getFieldMessage() {
        return fieldMessage;
    }

    public void setFieldMessage(FieldMessage fieldMessage) {
        this.fieldMessage = fieldMessage;
    }
}
