public class Parentesis {
    public static boolean esParentizada(String cadena){
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == '('){
                contador++;
            } else if (cadena.charAt(i) == ')'){
                contador--;
            }

            if (contador == -1){
                return false;
            }
        }
        return contador == 0; //con esto sabemos que el número de paréntesis de apertura y cierre esta equilibrado
        //y ya que un valor booleano si da == 0 dará true y si da algo distinto a 0 dará false, funciona
    }

    public static void main(String[] args) {
        System.out.println(esParentizada("(es (un ejemplo) (de) una (cadena bien) parentizada)"));
    }
}
