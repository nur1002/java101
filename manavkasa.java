import java.util.Scanner;
public class manavkasa {
    public static void main(String[] args) {
        /*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
         toplam tutarını ekrana yazdıran programı yazın.
        Meyveler ve KG Fiyatları
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/
        double armut,elma,dom,muz,pat;
        double armutkg=2.14,elmakg=3.67,domkg=1.11,muzkg=0.95,patkg=5.00,fiyat;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut kaç kilo?");
        armut=input.nextDouble();
        System.out.print("elma kaç kilo?");
        elma= input.nextDouble();
        System.out.print("domates kaç kilo?");
        dom= input.nextDouble();
        System.out.print("muz kaç kilo?");
        muz= input.nextDouble();
        System.out.print("patlıcan kaç kilo?");
        pat= input.nextDouble();
        fiyat=(armut*armutkg)+(elma*elmakg)+(dom*domkg)+(muz*muzkg)+(pat*patkg);
        System.out.print("toplam tutar:"+fiyat);




    }


}
