public class Alfabetica {
    public static boolean esAlfabetica(String palabra){


        for (int i = 0; i < palabra.length() - 1; i++) {

            if (palabra.charAt(i) > palabra.charAt(i + 1)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String palabra= "amor";
        boolean alfabetica = esAlfabetica(palabra);

        if (alfabetica) {
            System.out.println("Es alfabética");
        } else {
            System.out.println("No es alfabética");
        }
    }
}

/*public static boolean esAlfabetica(String palabra){
        boolean alfabetica = false;
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = i + 1; j < palabra.length(); j++) {
                if (palabra.charAt(i) < palabra.charAt(i + 1)){
                    alfabetica = true;
                }
            }

        }
        return alfabetica;
    }*/
