package eureka.msformation.doe;

import eureka.msformation.Entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository  extends JpaRepository<Formation,Long> {
}
