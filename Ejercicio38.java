import java.util.Scanner;
public class Ejercicio38{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace un reloj de arena");
        System.out.print("De cuanta altura quieres el reloj: ");
        int alt = sc.nextInt();
        int i = 0;
        int t = 1;
        int esInt = alt -1;
        int esDel = 0;
        if((alt < 3) || (alt  %2 ==0)){
            System.out.println("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3.");
        }else{
            while(t<alt /2+1){
                for(i = 1; i<=esDel;i++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (i = 1; i < esInt; i++) {
                    System.out.print("*");
                }
                System.out.print("*");
                System.out.println();
                t++;
                esDel++;
                esInt -= 2; 
            }
            esInt = 0;
            esDel = alt / 2;
            t = 1;
            while (t <= alt / 2 + 1) {
            for (i = 1; i <= esDel; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (i = 1; i < esInt; i++) {
                System.out.print("*");
            }
            if(t>1) {
                System.out.print("*");
            }
            System.out.println();
            t++;
            esDel--;
            esInt+=2;
            }
        }
    }        
}