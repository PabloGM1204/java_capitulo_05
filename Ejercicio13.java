import java.util.Scanner;;
public class Ejercicio13{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice cuantos números son positivos y cuales negativos");
        System.out.println("Dime diez números");
        int posi = 0;
        int nega = 0;
        for(int i = 1; i<=10; i++){
            int n = sc.nextInt();
            if(n == 0){
                System.out.println("El cero es neutro por lo que no cuenta, pon otro");
                i--;
            }else if (n<0){
                nega++;
            } else{
                posi++;
            }
        }
        System.out.println("Hay "+posi+" positivos y "+nega+" negativos");
    }
}