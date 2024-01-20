package mergeSort;

public class mergeSortIt {
    public static void main(String[] args) {
        int [] inputArray = {12,27,4,41,13,19,58,72,12,13,68,41};
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
        //merge(inputArray,st, mid, end):
    }


}
