import java.util.Scanner;
public class sinifgecti {
    public static void main(String[] args) {
        int mat,fiz,turk,kim,muz;
        double ort;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        mat=input.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fiz=input.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        turk=input.nextInt();
        System.out.print("Kimya notunzu giriniz:");
        kim=input.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        muz=input.nextInt();

        int i=0,top=0;
        if(mat<=100&&mat>=0){
            i++;
            top=top+mat;
        }
        if(fiz<=100&&fiz>=0){
            i=i+1;
            top=top+fiz;
        }
        if(turk<=100&&turk>=0){
            i=i+1;
            top=top+turk;
        }
        if (kim<=100&&kim>=0){
            i=i+1;
            top=top+kim;
        }
        if(muz<=100&&muz>=0){
            i=i+1;
            top=top+muz;
        }

        ort=(top/i);
        if(ort>=55) System.out.println("Sınıfı geçtiniz."+ort);
            else System.out.print("Sınıfta kaldınız."+ort);









    }
}
