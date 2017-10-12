import java.util.Scanner;

public class prawidlowyPESEL {
    public static boolean isPeselValid (String pesel){
        int [] wagi={1,3,7,9,1,3,7,9,1,3};
        int suma = 0;
        if (pesel.length()!=11)
            return false;
        else {
            for (int i = 0; i < 10; i++) {
                suma += Integer.parseInt(pesel.charAt(i) + "") * wagi[i];
            }
            int kontrolna = Integer.parseInt(pesel.charAt(10) + "");
            String sumastr = String.valueOf(suma);
            int ostatniacyfra = Integer.parseInt(sumastr.charAt(sumastr.length() - 1) + "");
            int testowa = 10 - ostatniacyfra;
            if (kontrolna == testowa)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner klawa=new Scanner(System.in);
        System.out.println("Podaj PESEL");
        String pesel=klawa.nextLine(); // Przykład prawidłowego: 44051401458
        if (isPeselValid(pesel))
            System.out.println("Dobry PESEL");
        else
            System.out.println("Zły PESEL");
    }
}
