package org.example.model;

import org.springframework.beans.factory.annotation.Value;

public class Message {
	
	@Value(value="5000")
	private int messageId ;
	
	@Value(value="Spring Java Based Configuration")
	private String message ;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", message=" + message + "]";
	}
	
	
	
	
	
	
	
}
