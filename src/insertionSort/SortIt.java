package insertionSort;
//this ones also got a big O n squared complexity
public class SortIt {
    public static void main(String[] args) {
        int[] arr1 = new int[]{12,6,25,56,34,9,17,21,49,2};
        int[]arrResult = insertionSort(arr1);
        for (int g=0; g< arrResult.length;g++){
            System.out.print(arrResult[g]+"  ");
        }
    }

    public static int[] insertionSort(int[] inputArray){

        //int [] newArray = new int[inputArray.length];
        for (int i=1; i< inputArray.length; i++){
            int element = inputArray[i];//.. is 1st item want bring to sorted area
            int j = i-1;//ie index of last item in sorted area
            while (j>=0 && inputArray[j]>element) {
                    inputArray[j+1]=inputArray[j];//so im shifting 1 place to right
                    j--;
            }
            inputArray[j+1]=element;
            }
        return inputArray;
        }


    }

