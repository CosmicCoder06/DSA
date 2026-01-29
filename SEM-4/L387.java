import java.util.Scanner;
public class L387 {
    public static int L387(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int result = L387(s);
        System.out.println("First non-repeating character's index: " + result);
        sc.close();
    }
}
344 125 345 151 28 242 387 242 13
