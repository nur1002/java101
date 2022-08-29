/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

import java.util.Scanner;
public class sicaklik {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int heat;
       System.out.print("bir sıcaklık giriniz:");
       heat=input.nextInt();
        if(heat <5){
            System.out.println("kayak yapabilirsiniz");}
        if(heat>=5&&heat<=15){
            System.out.println("Sinemaya gidebilirsiniz.");}
        if(heat>15&&heat<=25){
            System.out.println("Pikniğe gidebilirsiniz.");}
        if(heat>25){
            System.out.println("yüzmeye gidebilirsiniz.");
        }


    }
}
