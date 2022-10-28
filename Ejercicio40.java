import java.util.Scanner;
public class Ejercicio40{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dibuja un rombo");
        System.out.print("Dime la altura del rombo: ");
        int alt = sc.nextInt();
        int esIn = 1;
        int esEx = 0;
        if(((alt%2)== 0) && (alt<3)){
            System.out.println("Error debe poner un número impar mayor que tres");
        }else{
            for(int i = 1; i<=alt; i++){
                if(i==1 || i==alt){
                    while(esEx<alt/2){
                        System.out.print(" ");
                        esEx ++;
                    }
                    System.out.println("*");
                }
                if(i!=1 && i!=alt){
                    for(int a = alt-2;a>=0;a--){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }
        }
    }
}