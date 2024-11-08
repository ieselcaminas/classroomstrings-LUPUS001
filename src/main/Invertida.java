public class Invertida {
    public static String invertir(String original){
        String[] palabras = original.split(" ");
        String invertido = "";

        //Opcion A
        for (int i = palabras.length - 1; i >= 0 ; i--) {
            invertido += palabras[i] + " ";
        }


        //Opcion B
      /*  for (int i = 0; i < palabras.length ; i++) {
            invertido = palabras[i] + " " + invertido;
        }*/

        //haced el algoritmo
        return invertido;
    }
    public static void main(String[] args) {
        String original = "Esto es una frase";

        System.out.println(invertir(original));
    }
}

 /*   String[] longitud = palabras.split(" ");
        //String invertido = "";
        System.out.println(longitud.length); //para contar las palabras

        for (int i = 0; i < longitud.length; i++) {
            invertido = longitud[i] + " " + invertido; *//*invertimos palabras no caracteres*//*
        }

*/