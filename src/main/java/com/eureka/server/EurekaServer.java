package com.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册与发现组件
 * @author CLb
 * @version 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
	public static void main(String[] args) {
		//SpringApplication.run(EurekaServer.class, args);
		new SpringApplicationBuilder(EurekaServer.class).web(true).run(args);
	}
}
