public class Palindromo {
    public static boolean esPalindromo(String cadena){
        for (int i = 0; i < cadena.length(); i++) {
            //si la palabra es abcba
            char letra = cadena.charAt(i); //pillaría la primera "a" de a bcba
            char letraFinal = cadena.charAt(cadena.length()- 1 - i); //pillaria la última "a" de abcb a
            //primer if letra ="a" letraFinal="a" son iguales así que no da false
            //segundo if lo mismo pero con b
            //tercer if como c es impar
            if (letra != letraFinal){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo("abcba"));
    }
}

