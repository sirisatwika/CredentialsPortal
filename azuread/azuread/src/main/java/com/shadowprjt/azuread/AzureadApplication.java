package com.shadowprjt.azuread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AzureadApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureadApplication.class, args);
	}
    @Bean
    public RestTemplate getRestTemplate() {
    	return new RestTemplate(new HttpComponentsClientHttpRequestFactory());
    }
}
