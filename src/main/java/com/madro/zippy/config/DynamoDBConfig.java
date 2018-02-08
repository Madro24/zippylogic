package com.madro.zippy.config;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

@Configuration
@EnableDynamoDBRepositories("com.thermofisher.micro.account.dao.nonsql")
public class DynamoDBConfig {

	@Bean
	public AmazonDynamoDB amazonDynamoDB() {
		AmazonDynamoDBClientBuilder builder = AmazonDynamoDBClientBuilder.standard()
				.withCredentials(new DefaultAWSCredentialsProviderChain());

		AmazonDynamoDB amazonDynamoDB = builder.build();
		return amazonDynamoDB;
	}

}
