package com.imooc.test;

public class ChainTest {
    public static void main(String[] args) {
        ChainTest chainTest = new ChainTest();
        try {
            chainTest.test2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void test1() throws DrunkExcption {
        throw new DrunkExcption("喝酒别开车");
    }
    public void test2() {
        try {
            test1();
        } catch (DrunkExcption e) {
            RuntimeException newExc = new RuntimeException(e);
          //  newExc.initCause(e);
            throw newExc;
        }
    }

}
