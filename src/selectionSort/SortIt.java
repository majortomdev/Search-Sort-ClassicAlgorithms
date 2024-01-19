package selectionSort;
//this ones got a big O (n squared) complexity
public class SortIt {
    public static void main(String[] args) {
        int [] newArray = selectionSort(new int[]{2,5,34,12,6,3,4,1,9,7});
        for (int x=0; x<newArray.length; x++){
            System.out.print(newArray[x]+"  ");
        }
    }
    public static int[] selectionSort(int[]intArr){
        //int[] sorted = new int[jumbled.length];

        for (int i=0;i< intArr.length; i++){//this takes them one by one to find
            int min = i;//the smallest, then record its index and swap it wit the
            //one at index 0 then move to index 1 and repeat the process etc...
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
