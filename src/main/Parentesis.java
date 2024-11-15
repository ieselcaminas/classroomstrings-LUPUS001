public class Parentesis {
    public static boolean esParentizada(String cadena){
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == '('){
                contador++;
            } else if (cadena.charAt(i) == ')'){
                contador--;
            }

            if (contador == -1){ //esto ya que si en algún momento el contador da negativo esta mal parentizada ya que el contador puede dar cero,
                return false;    //pero no por esto estar correcto EJ=")(()" esto daría contador 0 por lo que el código interpretará
            }                   // que esta correcto, pero no es el caso y por eso es necesario este IF
        }
        return contador == 0; //con esto sabemos que el número de paréntesis de apertura y cierre esta equilibrado
        //y ya que un valor booleano si da == 0 dará true y si da algo distinto a 0 dará false, funciona
    }

    public static void main(String[] args) {
        System.out.println(esParentizada("(es (un ejemplo) (de) una (cadena bien) parentizada)"));
    }
}
