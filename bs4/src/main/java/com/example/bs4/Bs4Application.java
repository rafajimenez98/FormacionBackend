package com.example.bs4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import com.example.bs4.principal.Profiles;
import com.example.bs4.principal.profile1;
import com.example.bs4.principal.profile2;

@SpringBootApplication
public class Bs4Application {

	@Value("${spring.profiles.active}")
	private String activeProfile;

	public static void main(String[] args) {
		SpringApplication.run(Bs4Application.class, args);
	}

	@Bean
	@Qualifier(value = "Profile")
	@Profile("profile")
	Profiles getProfile(){
		if (activeProfile.equals("profile1")){
			return new profile1();
		}
		return new profile2();
	}
}
