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

    private static void merge(int[] inArray, int start, int mid, int end){
            int[] tempArray = new int [end-start +1];

            int lftArrIndx = start;//im going to make up my two arrays on each pass thru
            int rgtArrIndx = mid+1;//...as subarrays of inArray
            int k = 0;

            while(lftArrIndx<=mid && rgtArrIndx<=end){//ie
                if (inArray[lftArrIndx]>=inArray[rgtArrIndx]){
                    tempArray[k]=inArray[rgtArrIndx];
                    rgtArrIndx++;
                }else {
                    tempArray[k]=inArray[lftArrIndx];
                    lftArrIndx++;
                }
                k++;
            }//this ifelse just tidies up when only 1 subarray left
            if (lftArrIndx<=mid){
                while (lftArrIndx<=mid){
                    tempArray[k]=inArray[lftArrIndx];
                    k++;
                    lftArrIndx++;
                }
            } else if (rgtArrIndx<=end) {
                while (rgtArrIndx<=end){
                    tempArray[k]=inArray[rgtArrIndx];
                    rgtArrIndx++;
                    k++;
                }
            }
            //inArray=tempArray;
        for (int i=0; i<tempArray.length; i++){
            inArray[start+i]= tempArray[i];
        }
    }

}
