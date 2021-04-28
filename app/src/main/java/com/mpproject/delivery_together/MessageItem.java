package com.mpproject.delivery_together;

//메세지 담아놓을 객체
public class MessageItem {

    String name;
    String message;
    String time;

    public MessageItem(String name, String message, String time) {
        this.name = name;
        this.message = message;
        this.time = time;

    }

    public MessageItem(String name, String message) {
        this.name = name;
        this.message = message;
        this.time="0:0";
    }

    //firebase DB에 객체로 값을 읽어올 때
    //파라미터가 비어있는 생성자가 필요함.
    public MessageItem() {

    }

    //Getter & Setter
    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }


}