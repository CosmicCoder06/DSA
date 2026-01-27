import java.util.Arrays;
public class mergeSorted {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 4, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
// 13 167 344 345 242 125 



// class mergeSorted {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i=m-1, j=n-1, k=m+n-1;
//         while(i>=0 && j>=0){
//             if(nums1[i]>=nums2[j]){
//                 nums1[k--] = nums1[i--];
//             }else{
//                 nums1[k--] = nums2[j--];
//             }
//        }
//         while(j>=0){
//             nums1[k--] = nums2[j--];
//         }
//     }
// } 