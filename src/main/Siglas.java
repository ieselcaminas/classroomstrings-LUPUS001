public class Siglas {
    public static String siglas(String[] palabras){
        String res= "";
        char c;
        for (int i = 0; i < palabras.length; i++) {
            //Cogemos el primer carácter
            c = palabras[i].charAt(0);

            //Si es mayúscula
            if (Character.isUpperCase(c)){
                //se añade
                res += c;
            }

            //Opción B (un poco más complicada pero más corta [no hace falta el char])
            /*if (Character.isUpperCase(palabras[i].charAt(0))){
                res += palabras[i].charAt(0);
            }*/
        }
        return res;
    }

    public static void main(String[] args) {
        String frase = "Ave Maria cuando serás Mía";
        String[] palabras= frase.split(" ");

        System.out.println(siglas(palabras));
    }
}
