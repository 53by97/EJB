package com.kvvssut.ejb.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

import com.kvvssut.ejb.remote.HelloRemote;

@Stateless
public class HelloEJB3Stateless implements HelloRemote {
	
	@PostConstruct
	private void method1(){	
	}
	
	@PreDestroy
	private void method2(){		
	}

	@Override
	public String displayString(String message) {
		return message;
	}

}
