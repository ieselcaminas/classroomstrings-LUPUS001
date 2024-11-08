public class longitudII {
    public static void main(String[] args) {
        String palabras = "esto es una frase";
        boolean existe = false;
        int cuantas = 50;
        String[] longitud = palabras.split(" ");

        for (int i = 0; i < longitud.length; i++) {
            if (longitud[i].length() == cuantas){
                existe = true;
                break;
            }
        }
        if (existe){
            System.out.println("Existe alguna palabra de " + cuantas + " letras");
        }
    }
}
