package latihan4minggu6;

public class Latihan4Minggu6 {
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minimum = arr[i];
            int index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(minimum > arr[j]){
                    minimum = arr[j];
                    index = j;
                }
            }
            if(index != i){
                arr[index] = arr[i];
                arr[i] = minimum;
            }
        }
    }
    
    public static int binarySearch(int arr[], int first, int last, int key){
        if(last >= first){
            int mid = first + (last - first)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                return binarySearch(arr, first, mid - 1, key);
            } else {
                return binarySearch(arr, mid + 1, last, key);
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {55,95,42,36,94};
        
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        int key = 42;
        int last = arr.length-1;
        int result = binarySearch(arr, 0, last, key);
        
        if(result == -1){
            System.out.println("Data is not found!");
        } else {
            System.out.println("Data is found at index : " + result);
        }
    }
    
}
