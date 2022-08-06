import java.util.Scanner;

public class kdvhesapl {
    public static void main(String[] args) {
       double tutar, kdvlitutar, kdv;


       Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz:");
        tutar= input.nextDouble();
        boolean kosul=tutar >=1000;
        kdv =kosul ?0.08:0.18;
        kdvlitutar = (tutar*kdv)+tutar;

        System.out.println("KDVsiz tutar:"+tutar);
        System.out.println("KDVli tutar:"+kdvlitutar);
        System.out.println("KDV oranı:"+kdv);
        













    }


}




