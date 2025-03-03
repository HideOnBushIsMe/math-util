package com.hideonbush.mathutil.core;

public class MathUtility {
    // class này cung cấp các hàm liên quan toán học
    // nó là thư viện toán học. mà thư viện toán học  thì các hàm thường là static
    // hàm tính n!
    // n! = 1.2.3.....n trong đó
    // 0! = 1! = 1
    // mình ko tính quá 20! vì 21! kiểu long k chứa nổi, sẽ tính sai
    // mình chỉ tính từ 1 tới 20!
    // hàm nhận vào n, trả về n! (n trong đoạn [1,20])
    public static long getFactorial(int n) {
// kĩ thuật nhồi con heo đất, nhồi thịt
        // kĩ thuật nhân đồi, cộng dồn giá trị
        if (n <0 || n > 20){
            throw new IllegalArgumentException(" Invalid n. n must be in the range [0, 20]");
        } // gặp ngoại lệ hàm dừng luôn

        long result = 1;
        if( n == 0 ){
            return 1; // thoat sớm khi có thể, return ngay khi có thể
        }
        for (int i = 1; i <=n ; i++) {
            result *= i;
        }
        return result;
    }
}
    //dan dev phai test code cua  minh
    //? họ test code ntn
    //trc khi test thì cần có test case
    // test case #1
    //check GETFACTORIAL() with n =0
    // step:
    //N=0, CALL GETFACTORIAL(0)
    //EXPECTED RESULT/VALUE=1

    // TEST CASE#2
//check GETFACTORIAL() with n =1
// step:
//N=1, CALL GETFACTORIAL(1)
//EXPECTED RESULT/VALUE=1
