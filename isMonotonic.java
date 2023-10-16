public class file4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(isMonotonic(list));
    }
    static boolean isMonotonic(ArrayList<Integer> list){
        boolean ans=true;
        boolean ans2=true;
        for(int i=1;i<list.size();i++){
            if(list.get(i)<list.get(i-1)){
                ans=false;
            }
        }
        for(int i=list.size()-1;i>0;i--){
            if(list.get(i)>list.get(i-1)){
                ans2=false;
            }
        }
        return (ans || ans2);
    }
}
