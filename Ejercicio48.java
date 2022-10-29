import java.util.Scanner;
public class Ejercicio48{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice los números que aparecen y los que no");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int nc = 0;
        boolean igual;
        System.out.print("Dígitos que aparecen en el número: ");
        for(int i = 0;i<10;i++){
            igual = false;
            nc = n;
            while(nc>0){
                if((nc % 10)==i){
                    igual = true;
                }
                nc/=10;
            }
            if(igual){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.print("Dígitos que aparecen en el número: ");
        for(int i = 0;i<10;i++){
            igual = false;
            nc = n;
            while(nc>0){
                if((nc % 10)==i){
                    igual = true;
                }
                nc/=10;
            }
            if(!igual){
                System.out.print(i+" ");
            }
        }
    }
}