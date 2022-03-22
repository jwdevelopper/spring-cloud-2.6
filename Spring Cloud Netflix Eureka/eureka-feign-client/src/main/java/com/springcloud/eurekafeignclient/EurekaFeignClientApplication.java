package com.springcloud.eurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class EurekaFeignClientApplication {


	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignClientApplication.class, args);
	}


}
