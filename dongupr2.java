import java.util.Scanner;
public class dongupr2 {
    public static void main(String[] args) {

    /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
    girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program*/

        int n=0,total=0;

        Scanner inp=new Scanner(System.in);

       while(n%2==0){
           System.out.print("bir sayi girin:");
           n= inp.nextInt();
           if(n%4==0)
               total+= n;

       }
        System.out.print("toplam:"+total);

    }
    }