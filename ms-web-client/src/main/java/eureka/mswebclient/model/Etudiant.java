package eureka.mswebclient.model;

import lombok.Data;

@Data
public class Etudiant {
    private String nom;
    private String promo;
    private Formation formation;

}
