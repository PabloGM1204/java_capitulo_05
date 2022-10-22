import java.util.Scanner;
public class Ejercicio21{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice la media de los impares y el mayor de los pares");
        System.out.println("Dime números:");
        int n =0;
        int imp =0;
        int par =0;
        int contimp = 0;
        do{
            n = sc.nextInt();
            if(n%2 !=0 && n>0){
                imp += n;
                contimp++;
            }
            if(par<n){
                par = n;
            }
        }while(n>=0);
        if (contimp == 0){
        System.out.println("No has introducido números impares y el par mas alto ha sido: "+par);
        }else{
            System.out.println("La media de los impares es: "+(imp/contimp)+" y el par mas alto ha sido: "+par);
        }
    }
}