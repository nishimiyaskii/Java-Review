package _001;

/**
 * @Author cx
 * @Data 2021/1/20 17:18
 */
public interface Animal {

    // 接口中变量默认public final static
    public final static int A = 0;

    // 接口中抽象方法默认public abstract
    public abstract void a1();

    public final static Object d = new Object();

    // 接口中可以存在default开口的具有方法体的方法
    // 该方法只能通过实例化的子类调用
    default void a2() {
        System.out.println("default method in interface");
    }

    public static void a3() {
        System.out.println("a3");
    }

}
