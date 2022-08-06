import java.util.Scanner;

public class hipotenusbulanp {
    public static void main(String[] args) {

        //değişkenleri tanımla.

        int kenar1,kenar2;
        double hipo;

        Scanner input=new Scanner(System.in);
        System.out.print("1. kenarı giriniz:");
       kenar1 = input.nextInt();
        System.out.print("2. kenarı giriniz:");
        kenar2 = input.nextInt();
        hipo= Math.sqrt((kenar1*kenar1)+(kenar2*kenar2)) ;
        System.out.print("Hipotenüs:"+hipo ) ;



    }




}
