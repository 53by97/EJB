package com.kvvssut.ejb.remoteinterface;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

public interface HelloEJBRemote extends EJBObject{
	
	String helloString(String user) throws RemoteException;
}
