package eureka.msformation.proxy;

import eureka.msformation.model.Etudiant;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@FeignClient(name = "ms-scolarite")
@RibbonClient(name = "ms-scolarite",configuration = MyRobbin.class)
public interface Scolariteproxy {
    @GetMapping("/etudiants/search/findEtudiantsByIdFormation")
    CollectionModel<Etudiant> getEtudiant(@RequestParam("idf") Long id);
}
