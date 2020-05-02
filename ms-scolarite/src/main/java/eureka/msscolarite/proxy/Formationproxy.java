package eureka.msscolarite.proxy;

import eureka.msscolarite.models.Formation;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formation")
@RibbonClient(name = "ms-formation", configuration = MyRibbon.class)
public interface Formationproxy {
    @GetMapping("/formations/{id}")
    Formation getFormation(@PathVariable("id") Long idf);

}
