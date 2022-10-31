import java.util.Scanner;
public class Ejercicio59{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa hace un arbol de navidad");
        System.out.print("Dime la altura: ");
        int alt = sc.nextInt();
        int altc = 0;
        int ext = alt-3;
        int esint = 0;
        if(alt<4){
            System.out.println("Error la altura debe ser mayor de 4");
        }else{
            for(int i = 1; i<=ext; i++){
                System.out.print(" ");
            }
            System.out.println("*");
            altc = 2;
            while(altc<alt-1){
                for(int i = 1; i<=ext; i++){
                    System.out.print(" ");
                }
                System.out.print("^");
                for(int i = 1; i<esint; i++){
                    System.out.print(" ");
                }
                if(altc>2){
                    System.out.print("^");
                }
                System.out.println("");
                altc++;
                ext--;
                esint+=2;
            }
            for(int i = 1; i<altc*2-2; i++){
                System.out.print("^");
            }
            System.out.println("");
            ext = alt-3;
            for(int i = 1; i<=ext; i++){
                System.out.print(" ");
            }
            System.out.print("Y");
        }
    }
}