import java.util.Scanner;

public class usalma {
    public static void main(String[] args) {
        int i,base,pow,total=1;
        Scanner inp= new Scanner(System.in);
        System.out.print("Tabani giriniz:");
        base= inp.nextInt();
        System.out.print("kuvveti girin:");
        pow= inp.nextInt();

        for (i=1;i<=pow;i++){
            total*=base;

        }
        System.out.println(total);
    }
}
