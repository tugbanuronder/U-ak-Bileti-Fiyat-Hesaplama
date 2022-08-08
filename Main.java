import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int yolculuk,yas;
        double mesafe,tutar,indirim,indirimliTutar = 0,gıdısdonus;

        System.out.print("Mesafeyi km turuden giriniz : ");
        mesafe=input.nextDouble();
        System.out.print("Yasinizi giriniz :");
        yas=input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ):");
        yolculuk=input.nextInt();

        if(mesafe<0 || yas<0 || !(yolculuk ==1 || yolculuk==2)){
            System.out.println("Hatali Veri Girdiniz !\n");
        }

        tutar= mesafe * 0.10;

        if(yas<=12){
            indirim= tutar * 0.5;
            indirimliTutar = tutar - indirim;
        }
        else if(12<yas && yas<=24){
            indirim= tutar * 0.1;
            indirimliTutar= tutar - indirim;
        }
        else if(yas>65){
            indirim= tutar * 0.3;
            indirimliTutar= tutar - indirim;
        }
        else{
            tutar = mesafe * 0.1;
        }

        switch (yolculuk){
            case 1:
                System.out.println("Tek yon toplam tutarınız=" + tutar);
                break;
            case 2:
                 gıdısdonus = (indirimliTutar - (indirimliTutar * 0.20)) * 2 ;
                 System.out.println("Gidis donus toplam tutarınız=" + gıdısdonus);
                break;
        }




    }
}