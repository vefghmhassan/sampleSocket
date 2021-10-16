package com.exm.soket.sockettest;

public class ChatObject {
    public  String name;
    public  String message;

    public ChatObject(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public ChatObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
