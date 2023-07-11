package com.chat.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//to connect with server:  /server1
//to send message :          /app/message {}
//to subscribe so that we can receive msg: /topic/return-to

// https://www.youtube.com/watch?v=bBQnWcbxDo8

@SpringBootApplication
public class ChatroomappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatroomappApplication.class, args);
	}

}
