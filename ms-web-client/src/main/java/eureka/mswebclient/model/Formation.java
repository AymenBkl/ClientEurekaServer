package eureka.mswebclient.model;

import lombok.Data;
import org.springframework.hateoas.CollectionModel;

@Data
public class Formation {
    public Long idFormation;
    public String nom;
    public int duree;

    CollectionModel<Etudiant> etudiants;
}
