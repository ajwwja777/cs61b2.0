public class drawTriangle {
    public static void main(String[] args){
        drawTriangle1(10);
    }
    public static void drawTriangle1(int N){
        for (int i = 1;i <= N;i++){
            for (int j = 1;j <= i;j++){
                if (i == j){
                    System.out.println("*");
                }
                else{
                    System.out.print("*");
                }
            }
        }
    }
}
