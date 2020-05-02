package com.projet.tp2.demo;

import java.sql.Date;

import com.projet.tp2.demo.entities.Etudiant;
import com.projet.tp2.demo.entities.Formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication 
public class DemoApplication  implements CommandLineRunner{

	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	FormationRepository formationRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		@PostMapping("/formations")
		public Formation createFormation(@RequestBody Formation formation){
			return formationRepository.save(formation);
		}

	}

}
