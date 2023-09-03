public class hw0_exercise3 {
    public static void main(String[] args){
        int[] numbers =new int []{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max_for(numbers));
    }
    public static int max_for(int[] m){
        int max = m[0];
        for (int i = 1; i <= m.length - 1; i++){
            if (m[i] > max){
                max = m[i];
            }
        }
        return max;
    }
}
