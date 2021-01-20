package _004;

import java.io.*;
import java.util.Scanner;

/**
 * @Author cx
 * @Data 2021/1/20 19:55
 */
public class Demo004 {

    private int aa = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2; i ++) {
            System.out.println(reader.readLine());
        }
    }

    public void m1() {
    }

    public static void m2() {
        System.out.println(StaticInner.b);
    }

    class Inner {
        int a = 0;
//        static int b = 2; //- error
        Demo004 d = Demo004.this;
    }

    static class StaticInner {
        int a = 1;
        static int b = 2;


        public void m() {
            System.out.println(new Demo004().aa);
//            Demo004 d = Demo004.this; //- error in static innerclass
        }
    }

}
