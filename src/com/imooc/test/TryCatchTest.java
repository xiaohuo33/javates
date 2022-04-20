package com.imooc.test;

public class TryCatchTest {
    public static void main(String[] args) {
        TryCatchTest tryCatchTest = new TryCatchTest();
/*int result=tryCatchTest.test();
System.out.println("返回值为"+result);
int result2=tryCatchTest.text2();*/
        int result = tryCatchTest.text3();
        System.out.println("3ok"+result);
    }

    public int test() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常了");
            return -1;
        }
    }

    public int text2() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常了");
            return result = 999;
        } finally {
            System.out.println("这是finally");
            System.out.println("result的值" + result);
        }
    }

    public int text3() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常了");
        } finally {
            System.out.println("这是finally");
            System.out.println("result的值" + result);
        }
        System.out.println("我说text3");
        return 1111;
    }
}
