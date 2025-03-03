package com.hideonbush.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
    // CLASS NÀY XÀI BỘ THƯ VIỆN JUNIT, ĐƯỢC TẢI TRÊN MẠNG VỀ TỰ ĐỘNG BỞI MAVEN.
    // BỘ THƯ VIÊN NÀY DÙNG ĐỂ TEST TỰ ĐỘNG CÁC HÀM CỦA CLASS CHÍNH
    // NÓ SẼ TỰ CHẠY KHI ĐÓNG GÓI APP, ĐỂ CHECK XEM CÁC HÀM CÓ CHẠY ĐÚNG HAY KHÔNG
    // ĐÚNG TỨC LÀ EXPECTED == ACTUAL
    // NẾU CÓ NHIỀU TEST CASE, THÌ NÓ SẼ GOM STATUS CỦA CÁC TC LẠI THÀNH 2 MÀU XANH - ĐỎ, MẮT DÂN DEV CHỈ CẦN NHÌN 2 MÀU XANH(PASSED) - ĐỎ(FAILED)
    // Y CHANG CHO CÁC NN LẬP TRÌNH KHÁC -  CHUẨN TEST CODE RỒI
    // BỘ THƯ VIỆN NÀY CÒN GỌI LÀ FRAMEWORK, JUNIT TESTING FRAMEWORK

    // TEST CASE #1: VERIFY GETpublic void testFactorialGivenRightArgument0ReturnWell(){
    //        int n = 0;   //0!
    //        long expectedResult = 1; //hy vọng trả về
    //        long actualResult = MathUtility.getFactorial(n);//thực tế sẽ là thấy
    //        //đi so sánh 2 giá trị coi expected == actual???

    /// /        System.out.println("Expected: " + expectedResult  + " Actual: " + actualResult);
    /// /        System.out.println(expectedResult == actualResult); //true or false
    //
    //        // so sánh xem 2 đứa expected == actual ? không viết sout
    //        assertEquals(expectedResult, actualResult);
    //
    //    }FACTORIAL WITH N=0


    @Test
    public void testFactorialGivenRightArgument1ReturnWell(){
        int n = 1;   //0!
        long expectedResult = 1; //hy vọng trả về
        long actualResult = MathUtility.getFactorial(n);//thực tế sẽ là thấy
        //đi so sánh 2 giá trị coi expected == actual???
//        System.out.println("Expected: " + expectedResult  + " Actual: " + actualResult);
//        System.out.println(expectedResult == actualResult); //true or false

        // so sánh xem 2 đứa expected == actual ? không viết sout
        assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testFactorialGivenRightArgument5ReturnWell(){
        int n = 5;   //0!
        long expectedResult = 120; //hy vọng trả về
        long actualResult = MathUtility.getFactorial(n);//thực tế sẽ là thấy
        //đi so sánh 2 giá trị coi expected == actual???
//        System.out.println("Expected: " + expectedResult  + " Actual: " + actualResult);
//        System.out.println(expectedResult == actualResult); //true or false

        // so sánh xem 2 đứa expected == actual ? không viết sout
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testFactorialGivenRightArgument0ReturnWell(){
        int n = 0;   //0!
        long expectedResult = 1; //hy vọng trả về
        long actualResult = MathUtility.getFactorial(n);
        assertEquals(expectedResult, actualResult);
    }



    @Test
    public void testFactorialGivenWrongArgumentMinus1ThrowException(){

        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-1));
        // chạy hàm này thấy ngoại lệ bung ra, mừng rơi nc mắt
        // vì đưa -1 mà hàm ném ra ngoại lệ nghĩa là hàm chạy đúng do data cà chón2
    }
}