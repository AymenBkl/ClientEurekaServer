package eureka.mswebclient.ApiController;

import eureka.mswebclient.model.Etudiant;
import eureka.mswebclient.model.Formation;
import eureka.mswebclient.proxy.Formationproxy;
import eureka.mswebclient.proxy.Scolariteproxy;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ClientApi {
    @Autowired
    Scolariteproxy scolariteproxy;
    @Autowired
    Formationproxy formationproxy;
    @GetMapping("/student/{id}")
    public Etudiant getEtudiant(@PathVariable("id") Long id){
        return scolariteproxy.getEtudiant(id);
    };

    @GetMapping("/formation/{id}")
    public Formation getFormation(@PathVariable("id") Long idf){
        return formationproxy.getFormation(idf);
    }
}
