public class tk03 {
    public static void main(String[] args) {
        
        String x = "água";
        String y = "suco de maracuja";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);
        System.out.println("x: "+y);
    }
}
