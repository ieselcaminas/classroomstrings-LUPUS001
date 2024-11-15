import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParentesisTest {

    @Test
    @DisplayName("Está bien parentizada")
    void esParentizada() {
        assertTrue(Parentesis.esParentizada("Esto (es (un ejemplo) (de) una (cadena bien) parentizada)"));
    }

    @Test
    @DisplayName("Está mal parentizada")
    void noEsParentizada() {
        assertFalse(Parentesis.esParentizada("una )cadena (mal (parentizada)"));
    }
    @Test
    @DisplayName("Le sobra un ( al final")
    void noEsParentizadaFinal() {
        assertFalse(Parentesis.esParentizada("una )cadena (mal (parentizada)("));
    }

}
