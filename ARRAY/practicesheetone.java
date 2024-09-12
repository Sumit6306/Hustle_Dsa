package DSA.ARRAY;

import java.util.Scanner;

public class practicesheetone {
    static int mxvalue(int [] arr){
        int n=  arr.length;
        int mx = Integer.MIN_VALUE;

        for (int i =0;i<n;i++){
            if (arr[i]>mx){
                mx= arr[i];
            }
        }
       return mx;

    }
    static int secondLargest(int []arr){
        int n = arr.length;
        int secondLargest = mxvalue(arr);
        for (int i =0;i<n;i++){
            if (arr[i]==secondLargest){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int smx = mxvalue(arr);
        return smx;

    }
    static int minimumValue(int []arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i =0;i<n;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static void productOfElement(int [] arr){
        int n = arr.length;
        int product=1;
        for(int i = 0; i<n; i++){
            product= product*arr[i];
        }
        System.out.println("The Product of all Element is : " + product);
    }
static void duplicateElement(int [] arr){
        int n = arr.length;

        for (int i =0;i<n;i++){
            for (int j = i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate Element : " + arr[i]);
                }
            }
        }
}
static void greaterThanX(int [] arr ,int x){
        int n = arr.length;
        int count =0;
        for (int i =0;i<n;i++){
            if(arr[i]>x){
                count++;
            }
        }
    System.out.println(count);
}





    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the Element of array ");
        for (int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the value of X:");
        int x = sc.nextInt();

        productOfElement(arr);
        mxvalue(arr);
        System.out.println("Second Largest element is :" + secondLargest(arr));
        System.out.println("Second Largest element is :" + minimumValue(arr));
        duplicateElement(arr);
        System.out.println("Strictly Greater than"+ " " + x);
        greaterThanX(arr,x);


    }
}
