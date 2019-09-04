package com.deep.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersonDao {
	@Autowired
	ComponentJdbcConnection jdbcConnetion;

	public ComponentJdbcConnection getJdbcConnetion() {
		return jdbcConnetion;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnetion) {
		this.jdbcConnetion = jdbcConnetion;
	}

}
