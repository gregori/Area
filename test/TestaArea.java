/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo.gregori
 */
public class TestaArea {
    
    private Area area;
    private final double delta = 0.0001;
    
    public TestaArea() {
        area = new Area();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testaRaioPequeno() {
         double raio = 2;
         double esperado = 12.5664;
         assertEquals(esperado, area.area(raio), delta);
     }
     
     @Test
     public void testaRaioMedio() {
         double raio = 100.64;
         double esperado = 31819.3103;
         assertEquals(esperado, area.area(raio), delta);
     }
     
     @Test
     public void testaRaioGrande() {
         double raio = 150;
         double esperado = 70685.7750;
         assertEquals(esperado, area.area(raio), delta);
     }
}
