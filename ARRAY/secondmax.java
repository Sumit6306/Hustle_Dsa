package DSA.ARRAY;


    class Solution{
        public static void main(String[]args){
            int arr []={1,1,1,1,1,};
            int ans =0;



            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        ans++;

                    }

                }

            }
            System.out.println(ans);
        }


    }
