package com.kvvssut.ejb.ejbclient;

import javax.ejb.EJB;

import com.kvvssut.ejb.remote.HelloRemote;

public class MainEJB {
	
	@EJB
	private HelloRemote helloRemote;
	
	public MainEJB() {
	}
	
	public static void main(String[] args) {
		
		System.out.println(new MainEJB().helloRemote.displayString("Srimant"));
	}
	
}
