import java.util.Scanner;

public class basithesapmak {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        n1= input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        n2= input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("Seçiminiz: ");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.println("toplama:"+(n1+n2));
                break;
            case 2:
                System.out.println("çıkartma:"+(n1-n2));
                break;
            case 3:
                System.out.println("çarpma:"+(n1*n2));
                break;
            case 4:

                switch(n2) {
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez!");
                        break;
                    default:
                        System.out.println("bölme:" + (n1 / n2));
                }
                  break;
                default:
                        System.out.println("yanlış bir seçim yaptınız!");

                }
    }

}
