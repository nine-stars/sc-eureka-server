package com.yowits.rocky.eureka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableEurekaServer
@EnableHystrixDashboard
@EnableTurbine
@Slf4j
public class EurekasApplication implements CommandLineRunner{

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekasApplication.class).run(args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		log.info("rocky-eureka-server start OK");
	}
}
