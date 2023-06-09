package com.securityv2.Springsecurityv2;

//import java.util.Set;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.PasswordEncoder;

//import com.securityv2.Springsecurityv2.model.ERole;
//import com.securityv2.Springsecurityv2.model.RoleEntity;
//import com.securityv2.Springsecurityv2.model.UserEntity;
//import com.securityv2.Springsecurityv2.repository.UserRepository;

@SpringBootApplication
public class Springsecurityv2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springsecurityv2Application.class, args);
	}

/**
	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	UserRepository userRepository;

	@Bean
	CommandLineRunner init(){
		return args -> {

			UserEntity userEntity = UserEntity.builder()
					.email("xybonni@gmail.com")
					.username("bonier")
					.password(passwordEncoder.encode("Mateo182"))
					.roles(Set.of(RoleEntity.builder()
							.name(ERole.valueOf(ERole.ADMIN.name()))
							.build()))
					.build();

			UserEntity userEntity2 = UserEntity.builder()
					.email("masek.87@gmail.com")
					.username("maria")
					.password(passwordEncoder.encode("Violeta182"))
					.roles(Set.of(RoleEntity.builder()
							.name(ERole.valueOf(ERole.USER.name()))
							.build()))
					.build();

			UserEntity userEntity3 = UserEntity.builder()
					.email("mateo@gmail.com")
					.username("mateo")
					.password(passwordEncoder.encode("Mateo182Violeta"))
					.roles(Set.of(RoleEntity.builder()
							.name(ERole.valueOf(ERole.INVITED.name()))
							.build()))
					.build();

			userRepository.save(userEntity);
			userRepository.save(userEntity2);
			userRepository.save(userEntity3);
		};
	}
*/
}
