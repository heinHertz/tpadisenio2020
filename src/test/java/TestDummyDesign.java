import org.junit.Test;
import practica00.DummyDesign;

import static org.junit.Assert.assertEquals;

public class TestDummyDesign {
    @Test
    public void testintegrante1(){

        DummyDesign brian = new DummyDesign();
        assertEquals(1, brian.integrante1());
    }
    @Test
    public void testintegrante2() {
        DummyDesign gabriel = new DummyDesign();
        assertEquals(2, gabriel.integrante2());
    }
    
    @Test
    public void testintegrante3(){
        DummyDesign juan = new DummyDesign();
        assertEquals(3, juan.integrante3());
    }
    
    @Test
    public void testintegrante4(){
        DummyDesign federico = new DummyDesign();
        assertEquals(4, federico.integrante4());
    }
    
    @Test
    public void testintegrante5(){
        DummyDesign sebastian = new DummyDesign();
        assertEquals(5, sebastian.integrante5());
    }
}
