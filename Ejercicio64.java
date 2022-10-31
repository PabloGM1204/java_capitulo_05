import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;
public class Ejercicio64{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este program te da un cuadrado y tu puedes modificarlo con un menu");
        int alt = 3;
        int anc = 6;
        int op = 0;
        do{
            for(int i = 0; i<anc; i++){
                System.out.print("*");
            }
            System.out.println("");
            for(int i = 0; i<alt-2; i++){
                System.out.print("*");
                for(int j = 0; j<anc-2; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for(int i = 0; i<anc; i++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiar la orientación");
            System.out.println("4. Salir");
            System.out.print("Indique qué quiere hacer con el rectángulo: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    anc++;
                    alt++;
                    break;
                case 2:
                    if((anc>2) && (alt>2)){
                        anc--;
                        alt--;
                    }else{
                        System.out.println("El rectángulo no se puede hacer mas chico");
                    }
                    break;
                case 3:
                    int ancC = anc;
                    anc = alt;
                    alt = anc;
                    break;
                default:
                    break;
            }
            System.out.println("");
        }while(op!=4);
    }
}