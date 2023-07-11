package com.chat.app.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chat.app.models.Message;

@RestController
public class MessageController {
	
	//Koi client msg bhejege to ishi URL pe Bhejega (/message)
	//Jitne log es URL(/topic/return-to) ko subcribe kregnge rkhe sabko ye msg chla jayega
	@MessageMapping("/message")
	@SendTo("/topic/return-to")
	public Message getContent(@RequestBody Message message)
	{
		try
		{
			Thread.sleep(1000);
			
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		return message;
	}

}
