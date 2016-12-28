import java.util.Scanner;

public class Recursion {
    public static String recursion(String s)
    {

        if (s.length() == 1) {
            return "Palyndrome";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length())))
            {
                if (s.length() == 2)
                {
                    return "Palyndrome";
                }
                return recursion(s.substring(1, s.length() - 1));
            }
            else
            {
                return "Not palydrome";
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter symbols");
        Scanner scanf = new Scanner(System.in);
        System.out.println(recursion(scanf.nextLine()));
    }
}