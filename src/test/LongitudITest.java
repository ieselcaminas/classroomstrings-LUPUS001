import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class LongitudITest {
    @org.junit.jupiter.api.Test
    void test(){
        assertEquals(3, LongitudI.comprueba("1 22 333 22 444 22", 2));
    }
}
