package proje;

import java.util.Scanner ;

public class not {
    public static void main(String[] args) {
       //değişkenleri oluştur.
       int mat,tur,fiz,kim,tar,muz;
       Scanner input=new Scanner(System.in);

       System.out.print("matematik notunuzu giriniz:");
       mat=input.nextInt() ;
        System.out.print("türkçe notunuzu giriniz:");
        tur=input.nextInt() ;
        System.out.print("fizik notunuzu giriniz:");
        fiz=input.nextInt() ;
        System.out.print("kimya notunuzu giriniz:");
        kim=input.nextInt() ;
        System.out.print("tarih notunuzu giriniz:");
        tar=input.nextInt() ;
        System.out.print("müzk notunuzu giriniz:");
        muz=input.nextInt() ;
        int toplam=(mat+tur+fiz+kim+tar+muz);
        double sonuc=toplam/6;
        System.out.println("ortalamanız:"+sonuc);
        System.out.println(sonuc>60?"sınıfı geçti":" sınıfı geçemedi.");











    }
}
