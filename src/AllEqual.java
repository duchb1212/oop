import java.util.Scanner;
public class AllEqual {
    public static boolean isEqual(int a, int b, int c) {
        if ( a == b && a == c) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println(isEqual(a, b, c));
    }
}