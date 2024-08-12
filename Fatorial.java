public class Fatorial {
    public static void main(String[] args){
        int result = fatorial(5);
        System.out.println(result);
    }

    public static int fatorial(int n){
        if(n<=1){
            return 1;
        }

        return n*fatorial(n-1);
    }
}
