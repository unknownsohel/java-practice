public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{6,9,2,7},{1,3,7,2},{9,9,4,5},{1,2,3,4}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}
