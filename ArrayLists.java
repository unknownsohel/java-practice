
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(13); a.add(36); a.add(132);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(1); c.add(3); c.add(6);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4); b.add(7); b.add(32); b.add(90);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        System.out.println(arr);
    }
    
}
