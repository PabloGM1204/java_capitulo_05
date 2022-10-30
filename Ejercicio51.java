import java.util.Scanner;
public class Ejercicio51{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace que un gusano se coma los números 0 y 8");
        System.out.print("Dime un número(entero mayor que cero): ");
        int n = sc.nextInt();
        int nc = 0;
        int nv = 0;
        int f = 0;
        while(n>0){
            nv = n%10;
            if(nv==0){
                System.out.print("");
            }else if(nv==8){
                System.out.print("");
            }else{
                nc = (nc*10)+(nv);
            }
            n/=10;
        }
        while(nc>0){
            f=(f*10)+(nc%10);
            nc/=10;
        }
        System.out.println("Después de haber sido comido por el gusano numérico se queda en "+f);
    }
}