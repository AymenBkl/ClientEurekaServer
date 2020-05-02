package eureka.msformation.model;

import lombok.Data;

import java.util.Date;

@Data
public class Etudiant {
    private String nom;
    private String promo;
    private Date dateInscription;
    private Date dateN;
}
