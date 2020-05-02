package eureka.msscolarite.ApiController;

import eureka.msscolarite.Entites.Etudiant;
import eureka.msscolarite.Entities.doe.EtudiantRepository;
import eureka.msscolarite.proxy.Formationproxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiScolarite {
    @Autowired
    EtudiantRepository etudiantrepo;
    @Autowired
    Formationproxy formationproxy;
    @GetMapping("/etudiants/{id}")
    public Etudiant getEtudiant(@PathVariable("id") Long id){
        Etudiant etudiant = etudiantrepo.findById(id).get();
        etudiant.setFormation(formationproxy.getFormation(etudiant.getIdEtudiant()));
        return etudiant;
    }
}
