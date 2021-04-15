package latihan1minggu6;

public class Latihan1Minggu6 {
    
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        boolean Swap;
        
        for(int i = 0; i < n; i++){
            Swap = false;
            for(int j = 1; j < (n-i); j++){
                System.out.println(" A : " + arr[j-1] + " > " + " B : " + arr[j]);
                if(arr[j-1] > arr[j]){
                    //swap elemen
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    Swap = true;
                }
            }
            if(Swap == false){
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {9,5,8,2,6,1};
        
        System.out.println("Array Before Bubble Sort");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        bubbleSort(arr);
        
        System.out.println("Array After Bubble Sort");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
