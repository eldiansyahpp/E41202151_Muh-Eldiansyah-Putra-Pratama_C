package latihan3minggu6;

public class Latihan3Minggu6 {
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
                System.out.println(" A : " + arr[i] + " > " + " B : " + arr[index]);
                arr[index] = arr[i];
                arr[i] = minimum;
            }
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
