import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Digitos2Test {

    @Test
    @DisplayName("El primero es un número")
    void contarNumeros() {
        assertEquals(3, Digitos2.contarNumeros("1 20 hola 234 45a"));
    }
    @Test
    @DisplayName("El último es un número")
    void contarNumerosUltimo() {
        assertEquals(4, Digitos2.contarNumeros("1 20 hola 234 45"));
    }
    @Test
    @DisplayName("No hay números")
    void contarNumerosNinguno() {
        assertEquals(0, Digitos2.contarNumeros("hola y adiós"));
    }
    @Test
    @DisplayName("Todo son números")
    void contarNumerosTodos() {
        assertEquals(4, Digitos2.contarNumeros("12 1 1234 5"));
    }



}