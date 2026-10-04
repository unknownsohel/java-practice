import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args){
        List<List<Integer>> a = new ArrayList<>();
        for(int i=0;i<6;i++){
            a.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    a.get(i).add(1);
                }else{
                    int prev=a.get(i-1).get(j-1);
                    int next =a.get(i-1).get(j);
                    a.get(i).add(prev+next);
                }
            }
        }
        System.out.println(a);
    }
}
