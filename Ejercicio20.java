import java.util.Scanner;
public class Ejercicio20{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa  hace una piramide pero hueca");
        System.out.print("De cuanta altura quieres la piramide: ");
        int alt = sc.nextInt();
        System.out.print("De que simbolo quieres la piramide: ");
        String simb = sc.next();
        int ed = alt-1;
        int ei = 0;
        int i = 0;
        int p = 1;
        for(int r = 0; r<alt; r++){
            // Pone espacios
            for(i = 1; i<=ed; i++){
                System.out.print(" ");
            }
            // Escribe el primer simbolo
            System.out.print(simb);
            //Pone los espacios de dentro
            for(i = 1; i<ei; i++){
                System.out.print(" ");
            }
            //Pone el ultimo simbolo
            if(p>1){
                System.out.print(simb);
            }
            //salta de linea
            System.out.println("");
            ed--;
            ei +=2;
            p++;
        }
        // Pinta la base tal cual
        for(i=1;i<alt*2;i++){
            System.out.print(simb);
        }
    }
}