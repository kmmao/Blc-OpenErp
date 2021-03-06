package com.cspinformatique.blc.openerp.test.schema;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cspinformatique.blc.openerp.test.util.ScriptRunner;

public abstract class NotifierSchemaUtil {
	public static final String DS_NAME = "notifier";
	
	public static void recreateSchema(JdbcTemplate jdbcTemplate){
		// Generate a new schema.
		ScriptRunner.executeScript(
			jdbcTemplate.getDataSource(), 
			"jdbc/scripts/MySQL/recreateNotifierTestDB.sql"
		);
	}
}
