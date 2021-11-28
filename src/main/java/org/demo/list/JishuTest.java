package org.demo.list;

public class JishuTest {
    public static void main(String[] args) {
        Double m = 0d;
        for (double i = 1; i < 1000000000000d; i++) {
            m+=(1d/i);
        }
        System.out.println(m);
    }
}
