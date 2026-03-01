import java.util.Scanner;

public class Tab_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        boolean onlyDigits=s.matches("\\d+");
        System.out.println(onlyDigits);
    }
}