package eureka.mswebclient.proxy;

import eureka.mswebclient.model.Formation;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formation")
@RibbonClient(name = "ms-formation",configuration = Myribbon.class)
public interface Formationproxy {
    @GetMapping("/api/formations/{id}")
    Formation getFormation(@PathVariable("id") Long idf);

}
