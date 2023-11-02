public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 1, 12, -5, 16, 2, 12, 14 };

        System.out.println("Before sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");

        int minIndex = 0;
        for(int i=0;i<arr.length-1;i++){
            minIndex = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }




        System.out.println("");

        System.out.println("After sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


}
