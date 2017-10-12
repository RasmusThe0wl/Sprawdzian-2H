import java.util.Scanner;

public class metodaZiluWYRAZOWskladaSIEciagSTRING {
    public static int countWords(String string){
        return string.split(" ").length;
    }

    public static void main(String[] args) {
        Scanner klawa=new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String Str=klawa.nextLine();
        System.out.println("Liczba wyrazów w łańcuchu znaków: " +countWords(Str));
    }
}
