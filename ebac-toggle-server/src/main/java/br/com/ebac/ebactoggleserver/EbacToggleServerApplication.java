package br.com.ebac.ebactoggleserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EbacToggleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbacToggleServerApplication.class, args);
	}

}
