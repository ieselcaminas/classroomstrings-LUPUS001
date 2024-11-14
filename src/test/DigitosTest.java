import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitosTest {

    @Test
    void cuantosSonDigitos() {
        assertAll(
                () -> assertEquals(3, Digitos.cuantosSonDigitos("un 1 y un 20")),
                () -> assertEquals(4, Digitos.cuantosSonDigitos("14,25 abc"))
        );
    }
}