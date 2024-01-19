package selectionSort;

public class SortIt {
    public static void main(String[] args) {
        int [] newArray = selectionSort(new int[]{2,5,34,12,6,3,4,1,9});
        for (int x=0; x<newArray.length; x++){
            System.out.print(newArray[x]+"  ");
        }
    }
    public static int[] selectionSort(int[]intArr){
        //int[] sorted = new int[jumbled.length];

        for (int i=0;i< intArr.length; i++){
            int min = i;
            for (int j=i+1;j<intArr.length; j++){
                if(intArr[j]<intArr[min]){
                    min=j;
                }
            }
            int temp = intArr[i];
            intArr[i]=intArr[min];
            intArr[min]=temp;
        }
    return intArr;
    }
}
