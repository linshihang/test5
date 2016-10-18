package test5;

/**
 * Created by ASUS on 2016/5/20.
 */
public interface Inter1 {
    int a=3;
    void test1();
}

interface Inter2{
    void test2();
}

interface Inter3 extends Inter2{
    void test3();
}
