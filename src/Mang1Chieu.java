
import java.util.Scanner;

public class Mang1Chieu {
    public static void main(String[] args) {
        int n;
        System.out.printf("Nhap so phan tu mang: ");
        n = new Scanner(System.in).nextInt();
        int []a = new int[n];
        nhapMang(a, n);
        hienMang(a,n);
        max(a, n);
        System.out.println("Nhap x can tim: ");
        int x = new Scanner(System.in).nextInt();
        if(find(a, n, x) == 1){
            System.out.println("x co trong mang");
        }
        else{
            System.out.println("x khong co trong mang");
        }
        sort(a, n);
        System.out.println("Mang sau khi sort: ");
        hienMang(a, n);
        removeVal(a, n);
        System.out.println("Mang sau khi xoa: ");
        hienMang(a, n);
        System.out.println("Nhap vi tri can chen: ");
        int pos = new Scanner(System.in).nextInt();
        System.out.println("Nhap gia tri can chen: ");
        int val = new Scanner(System.in).nextInt();
        insert(a, n, pos, val);
        System.out.println("Mang sau khi chen: ");
        hienMang(a, n);
    }

    public static void nhapMang (int []a, int n){
        for(int i = 0; i< n; i++){
            System.out.printf("Nhap phan tu thu: "+i+": ");
            a[i] = new Scanner(System.in).nextInt();
        }
    }

    public static void hienMang (int []a, int n){
        for(int i = 0; i< n; i++){
            System.out.println("\t" + a[i]);
        }
    }

    public static void max (int []a, int n){
        int max = a[0];
        for(int i = 0; i < n; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println("Phan tu lon nhat: "+max);
    }

    public static int find (int []a, int n, int x){
        for(int i = 0; i <n ; i++){
            if(x == a[i]){
                return 1;
            }
        }
        return 0;
    }

    public static void sort (int []a, int n){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(a[j] < a[i]){
                    int tmp;
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void remove (int []a, int n, int pos){
        for(int i = pos; i < (n-1); i++){
            a[i] = a[i+1];
        }
        --n;
    }

    public static void removeVal (int []a, int n){
        System.out.println("Nhap gia tri can xoa: ");
        int val = new Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++){
            if(val == a[i]){
                remove(a, n, i);
            }
        }
    }

    public static void insert (int []a, int n, int pos, int val){
        if(pos < 0){
            pos = 0;
            return;
        }

        if(pos >= n){
            pos = n-1;
        }

        for(int i = n; i > pos; --i){
            a[i] = a[i-1];
        }
        a[pos] = val;
        n++;
    }
}
