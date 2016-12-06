package com.kvvssut.ejb.bean;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

import com.kvvssut.ejb.remote.MyTimerRemote;

public class MyTimerBean implements MyTimerRemote{
	
	@Resource
	private SessionContext context;

	@Override
	public void fireMePeriodically() {
		TimerService timerService = context.getTimerService();
		Timer timer = timerService.createTimer(1, 10, null);
		System.out.println("My Timer Created");
		
	}

	@Timeout
	public void handleTimeout(Timer timer) {
		System.out.println("Handle TimeOut Called");
		
	}

}
