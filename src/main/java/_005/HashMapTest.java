package _005;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试HashMap的线程安全问题
 * @Author cx
 * @Data 2021/1/23 21:52
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMapThread thread1 = new HashMapThread(),
                thread2 = new HashMapThread(),
                thread3 = new HashMapThread(),
                thread4 = new HashMapThread(),
                thread5 = new HashMapThread();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

    static class HashMapThread  extends Thread {

        private static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        private static AtomicInteger i = new AtomicInteger();

        @Override
        public void run() {
            while (i.get() < 1000000) {
                map.put(i.get(), i.getAndIncrement());
            }
        }
    }

}
