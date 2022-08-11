import java.util.Scanner;
public class dairedilimalani {
    public static void main(String[] args) {
        int r;
        double pi=3.14,alan,aci;
        Scanner input=new Scanner(System.in);

        System.out.print("Yarıçapı giriniz:");
        r= input.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz:");
         aci=input.nextInt();

         alan =(pi*(r*r)*aci)/360;
        System.out.print("Alan:"+alan);




        
    }
}
