package pe.com.pruebatecnica.josebejar.application;

import org.springframework.stereotype.Service;
import pe.com.pruebatecnica.josebejar.domain.CenterDistribution;

@Service
public class CenterDistributionServiceImpl implements CenterDistributionService{
    @Override
    public String getDescriptionFromName(String center) {
        for (CenterDistribution centerDistribution : CenterDistribution.values()) {
            if (centerDistribution.name().equalsIgnoreCase(center)) {
                String nameCenterByDescription = center + " : "+   centerDistribution.getValue();
                return nameCenterByDescription;
            }
        }
        return "Centro de distribución no encontrado.";
    }
}
