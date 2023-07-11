package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class Config implements WebSocketMessageBrokerConfigurer
{

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) 
	{
		//kis url pe server ki conectivity hogi
		//clinet msg bhejne se phle connectivity krega
		registry.addEndpoint("/server1").withSockJS();
		
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) 
	{
		registry.enableSimpleBroker("/topic");
		registry.setApplicationDestinationPrefixes("/app");
		
	}

	
	
}
