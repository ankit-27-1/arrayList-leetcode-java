public class file4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(lonelyNum(list));
    }
    static ArrayList<Integer> lonelyNum(ArrayList<Integer> list){
        ArrayList<Integer> list2=new ArrayList<>();
        if(list.get(0)==list.get(1)-1 || list.get(0)==list.get(1)+1){
            list2.add(list.get(0));
        }
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i)==list.get(i-1)-1 || list.get(i)==list.get(i+1)+1){
                list2.add(list.get(i));
            }
        }
        if(list.get(list.size()-1)==list.get(list.size()-2)-1  ||  list.get(list.size()-1)==list.get(list.size()-2)+1){
            list2.add(list.get(list.size()-1));
        }
        return list2;
    }
}
