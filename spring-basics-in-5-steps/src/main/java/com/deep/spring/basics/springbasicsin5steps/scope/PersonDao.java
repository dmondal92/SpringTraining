package com.deep.spring.basics.springbasicsin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {
	@Autowired
	JdbcConnection jdbcConnetion;

	public JdbcConnection getJdbcConnetion() {
		return jdbcConnetion;
	}

	public void setJdbcConnetion(JdbcConnection jdbcConnetion) {
		this.jdbcConnetion = jdbcConnetion;
	}

}
