package _002;

/**
 * @Author cx
 * @Data 2021/1/20 18:16
 */
public class Demo002 {

    public static void main(String[] args) {
        new B().mb();
    }

//    public static final int A; // error
    public final int B; // success

    public Demo002() {
//        A = 1;
        B = 1;
    }

    public void demo(final int x) {
//        x = 2; //- error
        System.out.println(x);
    }

}
