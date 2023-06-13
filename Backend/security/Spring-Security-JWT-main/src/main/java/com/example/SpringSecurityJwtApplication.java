package com.example;
/* 
import com.example.models.ERole;
import com.example.models.RoleEntity;
import com.example.models.UserEntity;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.Set;
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class SpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}
/* 
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
