package de.rekzi.postgresdemo;

import de.rekzi.postgresdemo.model.ID;
import de.rekzi.postgresdemo.repository.IDRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling
public class PostgresDemoApplication {

	Logger logger = LoggerFactory.getLogger(PostgresDemoApplication.class);

	@Autowired
	private IDRepository idRepository;

	public static void main(String[] args) {
		SpringApplication.run(PostgresDemoApplication.class, args);
	}

	@Scheduled(fixedRate = 1)
	public void insertID() {
		ID id = new ID();
		idRepository.saveAndFlush(id);
		logger.info("Saved ID=" + id.getId());
	}
}
