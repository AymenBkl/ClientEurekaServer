package eureka.msformation.ApiController;

import eureka.msformation.Entities.Formation;
import eureka.msformation.doe.FormationRepository;
import eureka.msformation.proxy.Scolariteproxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class FormationApi {
    @Autowired
    FormationRepository formationrepo;
    @Autowired
    Scolariteproxy scolariteproxy;
    @GetMapping("/formations/{id}")
    public Formation getFormation(@PathVariable("id") Long idf){
        Formation formation = formationrepo.findById(idf).get();
        formation.setEtudiants(scolariteproxy.getEtudiant(idf));
        return formation;
    }
}
