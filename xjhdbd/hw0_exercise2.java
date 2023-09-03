public class hw0_exercise2 {
    /** Returns the maximum value from m. */
    public static void max(int[] m) {
        int k,t;
        for(int i = 0;i <= m.length - 1;i++){
            k = i;
            for(int j = i + 1;j <= m.length - 1;j++) {
                if(m[k] < m[j]) {
                    k = j;
                }
            }
            if(i != k){
                t = m[i];
                m[i] = m[k];
                m[k] = t;
            }
        }
        for(int i = 0;i <= m.length - 1;i++){
            System.out.print(m[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        max(numbers);
        System.out.println(" ");
        for(int i = 0;i <= numbers.length - 1;i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
