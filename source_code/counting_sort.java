package algoritma_sorting;

import java.util.*;
import java.lang.Math;

public class counting_sort {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, n;
        System.out.print("Masukan Ukuran Array : ");
        n = input.nextInt();
        int[] data = new int[n];
        
        for (i = 0; i <= n - 1; i++) {
            System.out.print("masukan element ke : "+i+" : ");
            data[i] = input.nextInt();
        }
        
        // tampilkan elemen array
        System.out.print("[");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(Integer.toString(data[i]) + " ");
        }
        System.out.println("]");
        
        // TEKNIK COUNTING SORT
        int mIN, mAX;
        
        mIN = 99999;
        mAX = (int) (-99999);
        for (i = 0; i <= n - 1; i++) {
            if (data[i] > mAX) {
                mAX = data[i];
            }
            if (data[i] < mIN) {
                mIN = data[i];
            }
        }
        
        // buat array arrCount berukuran (MAX-MIN)+1
        int nCount;
        
        nCount = mAX - mIN + 1;
        int[] arrCount = new int[nCount];
        
        // inisialisasi array arrCount
        for (i = 0; i <= nCount - 1; i++) {
            arrCount[i] = 0;
        }
        
        // melakukan counting
        for (i = 0; i <= n - 1; i++) {
            int value;
            
            value = data[i];
            j = value - mIN;
            arrCount[j] = arrCount[j] + 1;
        }
        
        // meletakkan hasil counting ke array hasil sorting
        int k;
        
        k = 0;
        for (i = 0; i <= nCount - 1; i++) {
            if (arrCount[i] > 0) {
                int nK;
                
                nK = arrCount[i];
                int value;
                
                value = mIN + i;
                for (j = 1; j <= nK; j++) {
                    data[k] = value;
                    k = k + 1;
                }
            }
        }
        
        // cetak hasil sorting
        System.out.print("[");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(Integer.toString(data[i]) + " ");
        }
        System.out.println("]");
    }
}
