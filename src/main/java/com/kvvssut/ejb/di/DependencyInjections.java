package com.kvvssut.ejb.di;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.sql.DataSource;

public class DependencyInjections {
	
	@Resource(name="test_db")
	public void setDataSource(DataSource dataSource){
		DataSource ds = dataSource;
	}
	
	@EJB
	private DependencyInjections dependencyInjections;

}
