package DSA.AdavanceSortingAlgo;

public class mInversionCout {
    static int count ;
    static void mergesortArray(int [] a, int []b,int [] c){

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
                count += (a.length - i);
            }
            k++;
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

        }


    static void printArray(int [] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
//    static void  inversion(int []a ,int []b){
//
//        int i = 0; int j =0;
//        while(i<a.length && j<b.length){
//            if (a[i] > b[j]) {
//                count+=(a.length - i);
//                j++;
//            }
//            else{
//                i++;
//            }
//        }
//    }

static void mergeSort(int [] arr){
    int n = arr.length;
    if(n==1) return;
    int [] a= new int [n/2];
    int [] b = new int [n-n/2];

    for(int i =0; i<n/2;i++){
        a[i] = arr[i];
    }
    for(int i =0; i<n-n/2;i++){
        b[i]=arr[i+n/2];
    }
    mergeSort(a);
    mergeSort(b);
   // inversion(a,b);
    mergesortArray(a,b,arr);
    a = null;
    b = null;
}
    public static void main(String[] args) {
        int [] arr = {109,33,21,56,35,245,664};

        printArray(arr);
        mergeSort(arr);
printArray(arr);
        System.out.println(count);


    }
}
