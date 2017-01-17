package com.vv.spring.rest;

/**
 * Created by vasudvis on 1/17/2017.
 */
public class Message {

    private String Content;

    public Message(){

    }

    public Message(String content) {
        Content = content;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
