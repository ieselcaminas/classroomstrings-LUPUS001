
public class Digitos2 {
    public static int contarNumeros(String cadena) {
        int contador = 0;
        String[] palabras = cadena.split(" ");
        boolean esNumero;

        for (int i = 0; i < palabras.length; i++) {
            esNumero = true;
            for (int j = 0; j < palabras[i].length(); j++) {
                if (!Character.isDigit(palabras[i].charAt(j))){
                    esNumero = false;
                    break;
                }
            }
            if (esNumero) contador++;
        }

        return contador;
    }

    /*public static boolean esUnNumeroPalabra(String palabra){
        for (int j = 0; j < palabra.length(); j++) {
            if (!Character.isDigit(palabra.charAt(j))){
                return false;
            }
        }
        return true;
    }*/

    public static void main(String[] args) {
        System.out.println(contarNumeros("1 20 hola 234 45a"));
    }
}
