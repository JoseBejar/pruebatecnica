package pe.com.pruebatecnica.josebejar.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "api/v1/centerDistributionService")
public interface GetCenterDistributionController {

    @GetMapping(value = "/getCenterDistribution")
    ResponseEntity<String> getCenterDistribution(@RequestParam String center);
}
