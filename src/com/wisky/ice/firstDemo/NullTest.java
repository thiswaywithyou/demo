package com.wisky.ice.firstDemo;

public class NullTest {

    // 有n步台阶，一次只能上一步或者两步，共有多少中走法
//    public static void main(String[] args){
//        int n = 10;
//        sum(n);
//
//    }
//
//    public static int sum(int n){
//        if(n<=2) return n;
//        int x = sum(n-1)+sum(n-2);
//        System.out.println(x);
//        return x;
//    }

    public static void main(String[] args) {
        NullTest myNullTest = null;
        System.out.println(myNullTest.getInt());

    }

        public static int getInt() {
            return 1;
        }

}
