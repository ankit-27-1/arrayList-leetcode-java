public class file3 {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(height));
    }
    static int mostWater(int[] arr){
        int area=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    if(arr[i]*(arr.length-i-1)>area){
                        area=arr[i]*(arr.length-i-1);
                    }
                }
                else if(arr[j]<arr[i]){
                    if(arr[j]*(arr.length-i-1)>area){
                        area=arr[j]*(arr.length-i-1);
                    }
                }
            }
        }
        return area;
    }
}
