package quickSort;

public class quickSortIt {
    public static void main(String[] args) {
        int [] inputArray = {4,7,3, 44, 108, -5,-78,15,5,9,1,2};
        quickSortItOut(inputArray, 0, inputArray.length-1);
        for (int i=0; i<inputArray.length; i++){
            System.out.print(inputArray[i]+"  ");
        }
    }

    private static void quickSortItOut(int[]arr, int st, int end){
        if (st>=end)return;
        int k = partitionIt(arr, st, end);
        quickSortItOut(arr,st,k-1);
        quickSortItOut(arr,k+1,end);
    }

    private static int partitionIt(int[] arr, int st, int end) {
        int pivot = arr[end];
        int tTest = st;
        int leftMk = st-1;
        while (tTest<=end){
            if(arr[tTest]>pivot){
                tTest++;
            }else {
                leftMk++;
                int temp = arr[leftMk];
                arr[leftMk]=arr[tTest];
                arr[tTest]=temp;
                tTest++;
            }
        }
        return leftMk;
    }
}
