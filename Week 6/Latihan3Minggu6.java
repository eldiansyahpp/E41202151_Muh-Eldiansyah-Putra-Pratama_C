package latihan3minggu6;

public class Latihan3Minggu6 {
    public static void selectionSort(int[] arr){
         int n = arr.length;
        for (int i = 0; i < n; i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            System.out.println(" A : " + arr[i] + " > " + " B : " + arr[min_idx]);
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,5,8,2,6,1};
        
        System.out.println("Before Selection Sort");
        
        for(int i : arr){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        selectionSort(arr);
        
        System.out.println("After Selection Sort");
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
}
