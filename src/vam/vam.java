package vam;

import java.util.Scanner;

public class vam {
    
    public static void main(String[] args) {
        Scanner S = new Scanner (System.in);
        double qest , mablaq , sud , n , nerkh , modat ,kol;
        System.out.println("مبلغ وام دریافتی را وارد کنید");
        mablaq = S.nextDouble();
        System.out.println("درصد سود سالیانه را وارد کنید");
        nerkh = S.nextDouble();
        System.out.println("مدت بازپرداخت را به سال وارد کنید");
        modat = S.nextDouble();
        double pow = Math.pow(1+(nerkh/1200), modat*12);
        double surat= mablaq * (nerkh/1200) * pow ;
        double makhraj= pow - 1;       
        qest = (int)surat / makhraj;
        System.out.println("قسط ماهانه شما  برابر است با");
        System.out.println((int)qest);
        System.out.println("کل سود وام برابر است با");
        sud = (qest * (modat * 12) - mablaq );
        System.out.println((int)sud);
        System.out.println("مثدار کل بازپرداخت شما برابر است با");
        kol = qest * (modat * 12);
        System.out.println((int)kol);
    }
}