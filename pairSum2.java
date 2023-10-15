public class file4 {
    public static void main(String[] args) {
        int[] arr={11,15,6,8,9,10};
        int target=16;
        System.out.println(pairSum(arr,target));
    }
    static boolean pairSum(int[] arr,int target){
        int k=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                k=i;
            }
        }
        int p=k-1;
        int j=k;
        while(p!=j){
            if(arr[p]+arr[j]==target){
                return true;
            }
            else if(arr[p]+arr[j]<target){
                 j++;
            }
            else if(arr[p]+arr[j]>target){
                p--;
            }
            if(p==-1){
                p=arr.length-1;
            }
        }
        return false;
    }
}
