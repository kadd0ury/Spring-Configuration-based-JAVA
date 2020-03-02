package org.example.service;

import org.example.message.Messaging;

public class Communication {
	
	private Messaging message;	
	public Communication (Messaging message) {
		super ();
		this.message = message ;}
	public void communicate ()	 {	
		message.sendMessage();
}
	
}
