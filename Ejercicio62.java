import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Ejercicio62{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice si un número es afortunado");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        int nc = n;
        int longi = 0;
        int t = 0;
        do{
            if((n%10)==3){
                t++;
            }else if((n%10)==7){
                t++;
            }else if((n%10)==8){
                t++;
            }else if((n%10)==9){
                t++;
            }
            longi++;
            n/=10;
        }while(n>0);
        if(t>longi/2){
            System.out.println("El "+nc+" es un número afortunado");
        }else{
            System.out.println("El "+nc+" no es un número afortunado");
        }
    }
}