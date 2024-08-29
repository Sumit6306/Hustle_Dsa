package DSA.ARRAY;

public class SearchInarray {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,4,8};
        int x= 6;
        int ans = -1;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==x){
                ans= i;

            }
        }
        System.out.println("FOUND :" +  ans);
    }
}
