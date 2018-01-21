package com.pl.staticanalyzer.raport.builder;

import com.pl.staticanalyzer.raport.message.*;

import java.util.List;

public class Raport {
    private int id;
    private String name;
    private List<InterfaceMessage> interfacesMessage;
    private List<ClassMessage> classesMessage;
    private List<MethodMessage> methodsMessage;
    private List<FieldMessage> fieldsMessage;
    private List<AnnotatedMessage> annotatesMessage;

    private Raport(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.interfacesMessage = builder.interfacesMessage;
        this.classesMessage = builder.classesMessage;
        this.methodsMessage = builder.methodsMessage;
        this.fieldsMessage = builder.fieldsMessage;
        this.annotatesMessage = builder.annotatesMessage;
    }

    public static class Builder {
        private int id;
        private String name;
        private List<InterfaceMessage> interfacesMessage;
        private List<ClassMessage> classesMessage;
        private List<MethodMessage> methodsMessage;
        private List<FieldMessage> fieldsMessage;
        private List<AnnotatedMessage> annotatesMessage;

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withInterfacesMessage(List<InterfaceMessage> interfacesMessage) {
            this.interfacesMessage = interfacesMessage;
            return this;
        }

        public Builder withClassesMessage(List<ClassMessage> classesMessage) {
            this.classesMessage = classesMessage;
            return this;
        }

        public Builder withMethodsMessage(List<MethodMessage> methodsMessage) {
            this.methodsMessage = methodsMessage;
            return this;
        }

        public Builder withFieldsMessage(List<FieldMessage> fieldsMessage) {
            this.fieldsMessage = fieldsMessage;
            return this;
        }

        public Builder withAnnotatesMessage(List<AnnotatedMessage> annotatesMessage) {
            this.annotatesMessage = annotatesMessage;
            return this;
        }

        public Raport build() {
            return new Raport(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<InterfaceMessage> getInterfacesMessage() {
        return interfacesMessage;
    }

    public List<ClassMessage> getClassesMessage() {
        return classesMessage;
    }

    public List<MethodMessage> getMethodsMessage() {
        return methodsMessage;
    }

    public List<FieldMessage> getFieldsMessage() {
        return fieldsMessage;
    }

    public List<AnnotatedMessage> getAnnotatesMessage() {
        return annotatesMessage;
    }
}
