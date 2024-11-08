public class longitud {
    public static void main(String[] args) {
        String palabras = "esto es una frase";
        int cuantas = 2;
        int contador = 0;
        String[] longitud = palabras.split(" ");

        for (int i = 0; i < longitud.length; i++) {
            if (longitud[i].length() == cuantas){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
//cuantas palabras