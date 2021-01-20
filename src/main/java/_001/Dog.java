package _001;

/**
 * @Author cx
 * @Data 2021/1/20 17:21
 */
public class Dog extends Bird implements Animal {

    // 接口的实现类强制重写接口中的抽象方法
    @Override
    public synchronized void a1() {
        System.out.println("a1");
    }

    @Override
    public synchronized void m3() {

    }

    // 接口的实现类可以不重写接口的default方法
    // 重写的话，限定修饰符只能是public
//    public void a2 () {
//        System.out.println("子类重写接口的default方法");
//    }
}
