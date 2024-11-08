public class Digito {
    public static void main(String[] args) {
        String cadena = "22 jfj 3";
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contador++;
            }
        }
        System.out.println("La cadena tiene " + contador + " digitos");

    }
}
