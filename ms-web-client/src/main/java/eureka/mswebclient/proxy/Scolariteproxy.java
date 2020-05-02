package eureka.mswebclient.proxy;

import eureka.mswebclient.model.Etudiant;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-scolarite")
@RibbonClient(name = "ms-scolarite",configuration = Myribbon.class)
public interface Scolariteproxy {
    @GetMapping("/api/etudiants/{id}")
    Etudiant getEtudiant(@PathVariable("id") Long id);
}
