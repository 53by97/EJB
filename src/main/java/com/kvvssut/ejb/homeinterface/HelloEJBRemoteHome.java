package com.kvvssut.ejb.homeinterface;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

import com.kvvssut.ejb.remoteinterface.HelloEJBRemote;

public interface HelloEJBRemoteHome extends EJBHome{
	HelloEJBRemote create() throws CreateException, RemoteException;
}
