package pe.com.pruebatecnica.josebejar.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pe.com.pruebatecnica.josebejar.application.CenterDistributionService;

@RestController
public class GetCenterDistributionControllerImpl implements GetCenterDistributionController{

    private final CenterDistributionService centerDistributionService;

    public GetCenterDistributionControllerImpl(CenterDistributionService centerDistributionService) {
        this.centerDistributionService = centerDistributionService;
    }

    @Override
    public ResponseEntity<String> getCenterDistribution(String center) {
        return  ResponseEntity.ok(centerDistributionService.getDescriptionFromName(center));
    }
}
