import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SiglasTest {

    @Test
    void siglas() {
        assertEquals("EOI", Siglas.siglas(new String[]{"Escuela", "Oficial",  "de", "Idiomas"}));
    }
}