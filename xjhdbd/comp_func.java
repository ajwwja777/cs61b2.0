public class comp_func {
    public static void main(String[] args){
        System.out.println(max(1,10));
        System.out.println(Math.max(1,10));
    }
    public static int max(int x,int y){
        if (x > y){
            return x;
        }
        return  y;
    }
}
