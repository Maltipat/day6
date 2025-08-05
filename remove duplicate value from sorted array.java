import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        remove(arr);
    }
        public static int remove(int arr[]){
            int i=0;
            int n=arr.length;
            for(int j=1;j<n;j++){
                if(arr[i]!=arr[j])
                    i++;
                arr[i]=arr[j];
            }
            return i+1;
        }
}
