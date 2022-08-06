import java.util.Scanner;
public class ucgendealan {
    public static void main(String[] args) {
        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        double ken1,ken2,ken3,u,alan;

        Scanner input=new Scanner(System.in);
        System.out.print("1. kenarı giriniz:" ) ;
        ken1= input.nextDouble();
        System.out.print("2. kenarı giriniz.");
        ken2= input.nextDouble();
        System.out.print("3.kenarı giriniz:");
        ken3= input.nextDouble();

        u=(ken1+ken2+ken3)/2;
        alan= Math.sqrt(u*(u-ken1)*(u-ken2)*(u-ken3));

        System.out.print("Üçgenin alanı:"+alan);






    }

}
