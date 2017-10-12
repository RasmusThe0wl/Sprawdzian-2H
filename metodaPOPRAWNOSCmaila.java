import java.util.Scanner;

public class metodaPOPRAWNOSCmaila {
    public static boolean sprmail(String mail){
        int malpa=mail.indexOf("@");
        int kropka = mail.indexOf(".pl");
        int kropka1 = mail.indexOf(".eu");
        int kropka2 = mail.indexOf(".com");
        int kropka3 = mail.indexOf(".net");
        int kropka4 = mail.indexOf(".ski");
        int kropka5 = mail.indexOf(".br");
        int kropka6 = mail.indexOf(".ge");
        if (malpa !=-1){
            if (kropka !=-1||kropka1 !=-1||kropka2 !=-1||kropka3 !=-1||kropka4 !=-1||kropka5 !=-1||kropka6 !=-1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj e-mail");
        String mail=sc.nextLine();
        if (sprmail(mail))
            System.out.println("E-mail prawidłowy");
        else
            System.out.println("E-mail nieprawidłowy");
    }
}
