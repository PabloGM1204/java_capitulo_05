public class Ejercicio22{
    public static void main(String [] args) {
        System.out.println("Este programa muestra por pantalla los números primos entre 2 y 100");
        boolean primo = true;
        for(int n = 2; n<=100; n++){
            primo = true;
            for(int cont = 2; cont<n; cont++){
                if(n%cont == 0){
                    primo = false;
                }
            }
            if(primo){
                System.out.print(n+" ");
            }
        }
    }
}