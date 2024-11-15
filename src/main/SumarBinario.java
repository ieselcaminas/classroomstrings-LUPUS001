public class SumarBinario {
    public static String sumaBinario(String cadena1, String cadena2){
        String res = "";
        char b1;//almacena los '0' y '1' de cadena1
        char b2;//almacena los '0' y '1' de cadena2
        int digitoA;
        int digitoB;
        int acarreo = 0;
        int suma;
        for (int i = cadena1.length() - 1; i >= 0; i--) {
            //Sumar los dígitos iesimos
            //Si la suma es 0 -> 0
            b1 = cadena1.charAt(i); //pillamos el último número de 1001 "1" en este caso
            b2 = cadena2.charAt(i);
            //lo convertimos en integer:
            digitoA = Integer.parseInt("" + b1);
            digitoB = Integer.parseInt("" + b2);
            suma = digitoA + digitoB + acarreo;

            if (suma == 0){
                res = "0" + res;
                acarreo = 0;
            } else if(suma == 1){
                res = "1" + res;
                acarreo = 0;
            } else if (suma == 2){
                res = "0" + res;
                acarreo = 1;
            } else {
                res = "1" + res;
                acarreo = 1;
            }
        }
        if (acarreo == 1){
            res = "1" + res;
        }
        
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sumaBinario("1001", "1011"));
    }
}
