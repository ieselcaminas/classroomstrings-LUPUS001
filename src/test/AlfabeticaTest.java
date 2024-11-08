import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class AlfabeticaTest {

    @org.junit.jupiter.api.Test
    @DisplayName("La palabra es alfabética")
    void esAlfabetica() {
        assertTrue(Alfabetica.esAlfabetica("amor"));
    }
    @org.junit.jupiter.api.Test
    @DisplayName("La palabra no es alfabética")
    void  noEsAlfabetica() {
        assertFalse(Alfabetica.esAlfabetica("dedo"));
    }

}