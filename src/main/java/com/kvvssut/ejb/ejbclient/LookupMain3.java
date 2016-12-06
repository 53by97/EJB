package com.kvvssut.ejb.ejbclient;

import javax.annotation.Resource;
import javax.ejb.SessionContext;

import com.kvvssut.ejb.bean.HelloEJB3Stateless;

public class LookupMain3 {
	
	@Resource 
	private SessionContext context;
	
	public void setup() {
		HelloEJB3Stateless helloEJB3 =(HelloEJB3Stateless) context.lookup("ejb/HelloEJB"); 
	}
}
