public class Pasatiempos {
    public static String crearPasatiempo(String cadena){

        for (int i = 0; i < cadena.length(); i++) {//recorremos cada cáracter de la cadena

            if("aeiouAEIOU".indexOf(cadena.charAt(i)) != -1){ //comprobamos si el carácter es una vocal
                /*1. cadena.charAt(i) | aqui obtenemos cada caracter de la cadena por separada una a una.
                     Dicho de menor forma obtenemos el carácter de la posición "i"
                     Este carácter se verificará para saber si es una vocal.
                */
                /*2. "aeiouAEIOU".indexOf() | al aplicar el método .indexOf(), el programa busca si el carácter actual
                     (cadena.charAt(i)) está presente en/esta dentro de "aeiouAEIOU"*/
                /*3. != -1  | si indexOf no encuentra el carácter en la cadena devuelve -1. Por lo que si nos devuelve un -1
                *    el carácter actual/en la posición iesima no es una vocal. */

                cadena = cadena.replace(cadena.charAt(i), '.'); //reemplazamos las vocales por puntos
            }
        }
        return cadena;
    }
    public static void main(String[] args) {
        String cadena = "Me encanta hacer senderismo";

        System.out.println(crearPasatiempo(cadena));
    }
}

//Versión muy básica
/* cadena = cadena.replace("a", ".");
        cadena = cadena.replace("e", ".");
        cadena = cadena.replace("i", ".");
        cadena = cadena.replace("o", ".");
        cadena = cadena.replace("u", ".");*/