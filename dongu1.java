import java.util.Scanner;
public class dongu1 {
    public static void main(String[] args) {

        int k,i,ort=0,top=0,bayrak=0;
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz:");
        k= input.nextInt();

        for(i=0;i<=k;i++) {

           if (i % 3 == 0 & i % 4 == 0) {
               top=top+i;
               bayrak++;
           }
       }
       ort=top/(bayrak-1);
       System.out.print(+ort);
    }
}
