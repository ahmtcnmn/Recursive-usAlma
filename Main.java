import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    static int usAlma(int a,int b){
        int c=1;
        for (int i=1;i<=b;i++){
            c*=a;
        }
        return c;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a,b;
        out.println("Recursive Metotlar ile Üslü Sayı Hesaplama");
        out.print("Taban değeri giriniz : ");
        a= input.nextInt();
        out.print("Üs değerini giriniz : ");
        b= input.nextInt();
        out.println("Sonuc : "+usAlma(a,b));
    }
}
