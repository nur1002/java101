import java.util.Scanner;
public class vkindeksi {
    public static void main(String[] args) {
        double boy,kilo,vki;
        Scanner input=new Scanner(System.in);
        System.out.print("lütfen boyunuzu giriniz:");
        boy= input.nextDouble();
        System.out.print("lütfen kilonuzu giriniz:");
        kilo= input.nextDouble();
        vki= (kilo/(boy*boy));
        System.out.print("Vücut kitle indeksiniz:"+vki);


    }
}
