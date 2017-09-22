import java.util.ArrayList;


public class SmartCombining071 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(7);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("-----------");
        smartCombine(list1,list2);
        System.out.println(list1);
    }
    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (int i = 0; i < second.size(); i++) {
            if(!first.contains(second.get(i))) {
                first.add(second.get(i));
            }
        }
    }
}
