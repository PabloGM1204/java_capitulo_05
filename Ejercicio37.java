import java.util.Scanner;
public class Ejercicio37{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa convierte de un número a un sistema de 'palotes'");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int c = n;
        int nv = 0;
        int r = 0;
        int longi = 0;
        while(n>0){
            nv = (nv*10) + (n%10);
            n /=10;
            longi++;
        }
        System.out.println(nv);
        for(int i = 0;i<longi; i++){
            r = nv%10;
            for(int e = 0; e<r;e++){
                System.out.print(" | ");
            }
            if(r == c%10 ){
                System.out.print(" en el sistema de palotes");
            }else{
                System.out.print(" - ");
            }
            nv /=10;
        }
    }
}