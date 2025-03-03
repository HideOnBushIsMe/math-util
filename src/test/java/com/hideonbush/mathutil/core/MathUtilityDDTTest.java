package com.hideonbush.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.hideonbush.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
//chuẩn bị bộ data, các cặp data x! kì vọng bằng mấy
    // chính là mảng 2 chiều
    // hàm này phải là public static để các hàm @test mò vào lấy data để test run
    public static Object [][] initData(){
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},

        };
    }
    @ParameterizedTest
    @MethodSource("initData")   //ĐÂY CHÍNH LÀ CODE DDT
    public void testFactorialGivenRightArgumentReturnWell(int n, long expectedResult){

        //đi so sánh 2 giá trị coi expected == actual???
//        System.out.println("Expected: " + expectedResult  + " Actual: " + actualResult);
//        System.out.println(expectedResult == actualResult); //true or false

        // so sánh xem 2 đứa expected == actual ? không viết sout
        assertEquals(expectedResult, getFactorial(n));

    }
}