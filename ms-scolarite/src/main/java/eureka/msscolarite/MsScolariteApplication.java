package eureka.msscolarite;

import com.netflix.discovery.converters.Auto;
import eureka.msscolarite.Entites.Etudiant;
import eureka.msscolarite.Entities.doe.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
public class MsScolariteApplication implements CommandLineRunner {
	@Autowired
	EtudiantRepository etudiantrepo;
	public static void main(String[] args) {
		SpringApplication.run(MsScolariteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		etudiantrepo.save(new Etudiant(null,"aymen", Date.valueOf("2016-06-06"),"A",Date.valueOf("2017-09-05"),1L,null));
		etudiantrepo.save(new Etudiant(null,"aymen2",Date.valueOf("2016-06-06"),"B",Date.valueOf("2017-09-05"),1L,null));
		etudiantrepo.save(new Etudiant(null,"aymen3",Date.valueOf("2016-06-06"),"C",Date.valueOf("2017-09-05"),2L,null));
		etudiantrepo.save(new Etudiant(null,"aymen4",Date.valueOf("2016-06-06"),"D",Date.valueOf("2017-09-05"),3L,null));
	}
}
