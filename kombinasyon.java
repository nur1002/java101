import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {

        //n elemanlı küme =n; r =eleman sayısı
        // C(n,r) = n! / (r! * (n-r)!)
        int n,r,nfac=1,rfac=1,comb,nrfac=1;
        Scanner inp=new Scanner(System.in);

        System.out.print("kume sayisini  giriniz (n):");
        n=inp.nextInt();
        System.out.print("eleman sayisini giriniz (r):");
        r=inp.nextInt();
        //n!
        for(int i=1;i<=n;i++){
            nfac=nfac*i;
        }
        System.out.println(nfac);
        //r!
        for(int k=1;k<=r;k++){
            rfac=rfac*k;
        }
        System.out.println(rfac);

        //(n-r)!
        for( int j=1;j<=(n-r);j++){
            nrfac=nrfac*j;
        }
        System.out.println(nrfac);
       //kombinasyon hesabı
        comb=nfac/(rfac*nrfac);
        System.out.println("C(n,r)="+comb);




    }

}
