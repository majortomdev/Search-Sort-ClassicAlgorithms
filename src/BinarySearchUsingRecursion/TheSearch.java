package BinarySearchUsingRecursion;

public class TheSearch {
    public static void main(String[] args) {
        int[] testBucket = {2,6,16,26,32,33,51,68,80,91,92,95,99,
                120,125,128,133,135,150};
        System.out.println(binSearch(testBucket, 80));
        System.out.println(recursiveBinSearch(testBucket,0,testBucket.length-1,120));
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

    public static int recursiveBinSearch(int[] box, int st, int end, int token){
        System.out.println("[ "+st+"..."+(st + end) / 2+"..."+end+" ]");//
        if(st>end){
            return -1;
        }else {
            int chop = (st + end) / 2;
            if (box[chop] == token) {
                return chop;
            } else if (box[chop] > token) {
                   return recursiveBinSearch(box, st, chop - 1, token);
            } else {
                   return recursiveBinSearch(box, chop + 1, end, token);
            }
        }
    }
}
