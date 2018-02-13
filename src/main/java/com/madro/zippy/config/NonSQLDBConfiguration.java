package com.madro.zippy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.madro.zippy.dao.DynamoDBDataAccess;
import com.madro.zippy.dao.NonSqlDBDataAccess;

/**
 * Configuration class helps to switch between NonSQL database connection.
 * @author omar.madrid
 *
 */
@Configuration
public class NonSQLDBConfiguration {

	@Bean
	public NonSqlDBDataAccess appStaticDataDAO() {
		 return new DynamoDBDataAccess();
	}
}
