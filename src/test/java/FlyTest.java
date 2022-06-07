import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyTest {
//Se crea un test que comprueba que la excepción que lanza el método trowMyException sea igual a la esperada.
    @Test
    void testCheckException() throws Exception {
        Fly fly = new Fly("");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> fly.trowMyException());
    }

}