public class LongitudI {
    public static int comprueba(String cadena, int longitudBuscada) {
        int contador = 0;

        // Dividir la cadena en palabras
        String[] palabras = cadena.split(" ");

        // Contar las palabras de la longitud buscada
        for (String palabra : palabras) {
            if (palabra.length() == longitudBuscada) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String cadena = "1 22 333 22 444 22";

        // Contar palabras de longitud 2
        System.out.println(comprueba(cadena, 2)); // Salida esperada: 3
    }
}
