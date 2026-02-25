package Methods;

public class ReturnIsMandatory {
    public static void main(String[] args) {
        System.out.println(ananya(10));
    }

    public static int ananya(int a) {
        if (a < 5) {
            return a;
        }
        return -9;
    }

}