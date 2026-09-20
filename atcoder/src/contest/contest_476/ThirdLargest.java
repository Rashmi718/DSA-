package contest.contest_476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThirdLargest {

    private static void merge(int[] arr , int low, int mid, int high) {
        int n = mid - low + 1;
        int m = high - mid;

        int[] left = new int[n];
        int[] right = new int[m];

        for (int i = 0; i < n; i++) {
            left[i] = arr[low + i];
        }

        for(int j = 0; j < m; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = low;

        while (i < n && j < m) {
            if (left[i] >= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n) {
            arr[k++] = left[i++];
        }

        while (j < m) {
            arr[k++] = right[j++];
        }
    }


    private static void mergeSort(int[] arr , int low, int high) {
        if(low < high) {
            int mid = low + (high - low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        int[] A  = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(A, 0, N-1);

        for(int i = N - 1 ; i >= N - 3 ; i--){
            System.out.println(A[i]);
        }
    }
}
