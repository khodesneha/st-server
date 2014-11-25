package com.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@ComponentScan
@EnableAutoConfiguration
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@PropertySource(value = { "classpath:aplication.properties" })
public class Application {

	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(Application.class);
//	    app.setShowBanner(false);
//	    app.run(args);
	    
	    SpringApplication.run(Application.class, args);
	    
	    
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		
//		StoreAssociateRepository repository = context.getBean(StoreAssociateRepository.class);
//		
//		StoreAssociate storeAssociate = repository.save(new StoreAssociate("firstName1", "lastName1", "user1@test.com", "password"));
//		System.out.println(storeAssociate + "\n");
//		
//		StoreAssociate storeAssociate2 = repository.save(new StoreAssociate("firstName2", "lastName2", "user2@test.com", "password"));
//		System.out.println(storeAssociate2 + "\n");
//		
//		StoreAssociate storeAssociate3 = repository.findOne(storeAssociate2.getId());
//		System.out.println(storeAssociate3 + "\n");
//		
//		System.out.println("\n\n");
//		
//		Iterable<StoreAssociate> list = repository.findAll();
//		
//		for (StoreAssociate iterator : list) {
//			System.out.println(iterator + "\n");
//		}
	}
}
