package com.kvvssut.ejb.ejbclient;

import javax.ejb.EJB;

import com.kvvssut.ejb.remote.MyTimerRemote;

public class MainTimerService {

	@EJB
	private static MyTimerRemote timerRemote;

	
	public static void main(String[] args) {
		timerRemote.fireMePeriodically();
		System.out.println("Timer initiated");

	}

}
