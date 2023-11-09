package pe.com.pruebatecnica.josebejar.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pe.com.pruebatecnica.josebejar.domain.CenterDistribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CenterDistributionTest {

     private CenterDistributionService centerDistributionService;

    @BeforeEach
    public void setUp() {
        centerDistributionService = new CenterDistributionServiceImpl();
        System.out.println("CenterDistributionService initialized.");
    }


    @Test
    void testGetDescriptionFromName() {

        CenterDistribution[] mockCenterDistributions = {
                CenterDistribution.LURIN,
                CenterDistribution.ICA,
                CenterDistribution.TRUJILLO,
                CenterDistribution.HUANUCO
        };
        mockStatic(CenterDistribution.class);
        when(CenterDistribution.values()).thenReturn(mockCenterDistributions);

        String description1 = centerDistributionService.getDescriptionFromName("LURIN");
        assertEquals("LURIN : ES UN DISTRITO COSTEÑO QUE SE ENCUENTRA AL SUR DE LIMA", description1);

        String description2 = centerDistributionService.getDescriptionFromName("NoExiste");
        assertEquals("Centro de distribución no encontrado.", description2);

        verify(CenterDistribution.class, times(1));
        CenterDistribution.values();
    }
}
