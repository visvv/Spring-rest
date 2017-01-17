package com.vv.spring.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vasudvis on 1/17/2017.
 */

@RestController
public class MessageController {

    @RequestMapping("/message")
    public Message getMessage(){
       return new Message("Hai, this is a message");
    }

    @RequestMapping("/reply")
    public Message getReply(@RequestBody Message message){
        return new Message(message.getContent());
    }


    @RequestMapping("/id/{id}")
    public Message getMessageById(@PathVariable Integer id){
        return new Message("This is the message with id " + id );
    }
}
