import java.util.Scanner;
public class Lec2 {


    public static int max(int[] arr) {
       
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

      public static int min(int[] arr){      
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Array a max: " + max(a));
        System.out.println("Array a min: " + min(a));

        int diff = max(a) - min(a);
        System.out.println("Difference: " + diff);

        in.close();
    }
}


//-----------------------------------------LEET CODE PROBLEMS---------------------------------------
// RAINWATER TRAPPING
// TWO SUM
// VALID PARENTHESIS
// MAXIMUM SUM ARRAY
// SLIDING WINDOW MAX
// MAXM SUM ARRAY AFTER DELETION
// COUNT RANGE SUM

// rabit and turtle race
//