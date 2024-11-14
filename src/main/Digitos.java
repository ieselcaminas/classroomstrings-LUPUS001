public class Digitos {
    public static int cuantosSonDigitos(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        String cadena = "22 jfj 3";

        //System.out.println("La cadena tiene " + contador + " digitos");
        System.out.println("La cadena tiene " + cuantosSonDigitos(cadena) + " digitos");

    }
}
