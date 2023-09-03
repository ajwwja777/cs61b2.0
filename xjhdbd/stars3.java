public class stars3 {
    public static void main(String[] args){
        int i = 1;
        int j = 1;
        while (i <= 5){
            while (j <= i){
                if (j == i) {
                    System.out.println("*");
                }
                else {
                    System.out.print("*");
                }
                j++;
            }
            j = 1;
            i++;
        }
    }
}
