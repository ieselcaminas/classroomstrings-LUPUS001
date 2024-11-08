public class longitudIII {
    public static void main(String[] args) {
        String frase = "Ace era un";
        String cadena = "22 333 4444 55555 22";
        int num = 7;
        boolean largo = false;

        String[] longitud = cadena.split(" ");

        for (int i = 0; i < longitud.length; i++) {
           if (longitud[i].length() < num){
                largo = true;
                break;
           }
        }

        if (largo){
            System.out.println("Hay alguna palabra larga");
        } else {
            System.out.println("Todas las cadenas son cortas");
        }
    }
}
