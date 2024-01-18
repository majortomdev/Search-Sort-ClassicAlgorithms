package BinarySearchUsingRecursion;

public class TheSearch {
    public static void main(String[] args) {
        int[] testBucket = {2,6,16,26,32,33,51,68,80};
        System.out.println(binSearch(testBucket, 80));

    }
    //just a plain ol binary search first for old times sake
    public static int binSearch(int[] carton, int token){
        int st = 0;
        int end = carton.length-1;

        while (st<=end){
            int chop = (st+end)/2;
            if(carton[chop]==token)return chop;
            else if (carton[chop]>token) {
                end=chop-1;
            }else {
                st=chop+1;
            }
        }
        return -1;
    }
}
