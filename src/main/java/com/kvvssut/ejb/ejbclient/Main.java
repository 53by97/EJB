package com.kvvssut.ejb.ejbclient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

import com.kvvssut.ejb.homeinterface.HelloEJBRemoteHome;
import com.kvvssut.ejb.remoteinterface.HelloEJBRemote;

public class Main {
	
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			Object remote = context.lookup("java:/comp/env/HelloEJBBean");
			HelloEJBRemoteHome remoteHome = (HelloEJBRemoteHome) PortableRemoteObject.narrow(remote, HelloEJBRemoteHome.class);
			HelloEJBRemote ejbRemote = remoteHome.create();
			System.out.println(ejbRemote.helloString("Srimant"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
