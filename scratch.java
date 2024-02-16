import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.println("kayıt olacağınız kullanıcı isminizi girin");

        Scanner igiris=new Scanner(System.in);
        String ismi=igiris.nextLine();


        System.out.println("kayıt olacağınız parolanızı girin");
        Scanner sifresi=new Scanner(System.in);
        int parola=sifresi.nextInt();

        System.out.println("şimdi giriş yapmaya hazırsınız ===>>>");

        Scanner giris=new Scanner(System.in);
        System.out.println("kullanıcı adı gir");
        String dogrulakadi=giris.nextLine();
        System.out.println("parolayı giriniz");
        Scanner dogrulapar=new Scanner(System.in);
        int par=dogrulapar.nextInt();

        if(ismi.equals(dogrulakadi)){
           System.out.println("girilen kullanıcı adı dogru");
           if(par == parola) {

               System.out.println("parola dogru"); }
           else {
               System.out.println("parola yanlış");
           }

           }else{
           System.out.println("girilen kullanıcı adı yanlış ");
        }


    }


    }
