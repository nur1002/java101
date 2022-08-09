import java.util.Scanner;
public class projeler {
    public static void main(String[] args) {
        /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*/

        int km;
        double kmbasi=2.20,tutar,acilis=10;
        Scanner input=new Scanner(System.in);
        System.out.print("Gidilen mesafeyi giriniz:");
        km= input.nextInt();
        tutar=(km*kmbasi)+acilis;
        System.out.print(tutar>=20?"ödenecek tutar:"+tutar:"ödenecek tutar:20");








    }







}
