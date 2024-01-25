package mergeSort;

public class mergeSortIt {
    public static void main(String[] args) {
        //int [] inputArray = {12,27,4,41,13,19,58,72,12,13,68,41};
        int [] inputArray = {3,5,1,7,4,2};
        //int [] inputArray = {7,4};
        sort(inputArray,0, inputArray.length-1);
        for (int i=0; i<inputArray.length; i++){
            System.out.print(inputArray[i]+"  ");
        }
    }

    private static void sort(int []inputArray, int st, int end){
        if(end<=st) return;

        int mid = (st+end)/2;
        sort(inputArray,st,mid);
        sort(inputArray, mid+1, end);
        merge(inputArray,st, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end){
            int[] tempArray = new int [end-start +1];

            int left = start;//im going to make up my two arrays on each pass thru
            int right = mid+1;//...as subarrays of inArray
            int k = 0;

            while(left<=mid && right<=end){//ie
                if (arr[left]>=arr[right]){
                    tempArray[k]=arr[right];
                    right++;
                }else {
                    tempArray[k]=arr[left];
                    left++;
                }
                k++;
            }//this ifelse just tidies up when only 1 subarray left
            if (left<=mid){
                while (left<=mid){
                    tempArray[k]=arr[left];
                    k++;
                    left++;
                }
            } else if (right<=end) {
                while (right<=end){
                    tempArray[k]=arr[right];
                    right++;
                    k++;
                }
            }
            //inArray=tempArray;
        for (int i=0; i<tempArray.length; i++){
            arr[start+i]= tempArray[i];
        }
    }

}
