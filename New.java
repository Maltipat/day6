import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // Ensure array is sorted
        int newLength = remove(arr);
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static int remove(int arr[]) {
        int i = 0;
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
