package pe.com.pruebatecnica.josebejar.application;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenterDistributionTest {

     private CenterDistributionServiceImpl centerDistributionService;

    @Before
    public void setUp() {
        centerDistributionService = new CenterDistributionServiceImpl();
    }


    @Test
    public void testGetDescriptionFromName() {

        String description1 = centerDistributionService.getDescriptionFromName("LURIN");
        assertEquals("LURIN : ES UN DISTRITO COSTEÑO QUE SE ENCUENTRA AL SUR DE LIMA", description1);


        String description2 = centerDistributionService.getDescriptionFromName("ica");
        assertEquals("ica : ICA ES UNA CIUDAD DEL CENTRO DEL SUR DEL PERU", description2);


        String description3 = centerDistributionService.getDescriptionFromName("NoExiste");
        assertEquals("Centro de distribución no encontrado.", description3);
    }
}
