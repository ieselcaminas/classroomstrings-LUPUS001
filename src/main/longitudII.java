public class longitudII {
    public static boolean esLongitudII(String array, int longitud) {
        String[] palabras = array.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == longitud) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String array = "Ave abe quillo amoo";
        int longitud = 4;

        if (esLongitudII(array, longitud)) {
            System.out.println("Existe alguna palabra de " + longitud + " letras");
        }
    }
}
