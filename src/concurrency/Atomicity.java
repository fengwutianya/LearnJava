package concurrency;

/**
 * Created by xuan on 16-9-19.
 */
public class Atomicity {
    int i;
    void f1() { i++; }
    void f2() { i++; }
}
/*
exec: javap -c Atomicity
 */
