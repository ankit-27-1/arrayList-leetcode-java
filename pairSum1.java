public class file4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(pairSum(arr,5));
    }
    static boolean pairSum(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            if (arr[i] + arr[j] == target) {
                return true;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
        }
        return false;
    }
}
