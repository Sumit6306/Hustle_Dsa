package DSA.AdavanceSortingAlgo;

public class mergeSortedArray {
    static void printArray(int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
static void mergeArrays(int [] a ,int [] b, int []c){
    int i =0; int j =0; int k =0;
    while(i < a.length && j< b.length){
        if (a[i] <= b[j]){
            c[k] = a[i];
            i++;
            k++;
        }else{
            c[k] = b[j];
            j++;
            k++;
        }
         if(i==a.length ){
             while(j < b.length) {
                 c[k] = b[j];
                 j++;
                 k++;
             }
         }
          if(j==b.length){
              while(i <a.length){
                  c[k] = a[i];
                  i++;
                  k++;
              }
          }

    }
}
    public static void main(String[] args) {
        int [] a = {2,4,6,8,10};
        int [] b = {1,3,5,7,9,14};
        int [] c = new int[a.length + b.length];
mergeArrays(a, b, c);
printArray(c);
    }
}
