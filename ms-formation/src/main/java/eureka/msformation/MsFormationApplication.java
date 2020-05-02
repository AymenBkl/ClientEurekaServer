package eureka.msformation;

import com.netflix.discovery.converters.Auto;
import eureka.msformation.Entities.Formation;
import eureka.msformation.doe.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@EnableFeignClients
public class MsFormationApplication implements CommandLineRunner {
	@Autowired
	FormationRepository formationrepo;
	@Autowired
	RepositoryRestConfiguration reporestconf;
	public static void main(String[] args) {
		SpringApplication.run(MsFormationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		reporestconf.exposeIdsFor(Formation.class);
		Formation f1=  formationrepo.save(new Formation(null, "Java",30,null));
		Formation f2= formationrepo.save(new Formation(null, "Angular",40,null));

	}
}
