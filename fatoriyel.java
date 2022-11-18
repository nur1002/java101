import java.util.Scanner;

public class fatoriyel {
    public static void main(String[] args) {
        //faktöriyel bulan program

        int i,n,total=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        n= inp.nextInt();

        for(i=1;i<=n;i++){

            total = total *i;

        }
        System.out.print(total);
    }
}
