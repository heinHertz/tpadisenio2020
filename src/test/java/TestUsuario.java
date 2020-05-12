import org.junit.Test;

import usuario.Usuario;

import static org.junit.Assert.assertEquals;

public class TestUsuario {
    @Test
    public void test1(){

         Usuario fede = new Usuario();
         
        assertEquals(100,fede.getFede(), 0);
        
    }


}
