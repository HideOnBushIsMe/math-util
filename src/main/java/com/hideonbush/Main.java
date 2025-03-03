package com.hideonbush;

import com.hideonbush.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0ReturnWell();
        testFactorialGivenRightArgument1ReturnWell();
        testFactorialGivenRightArgument5ReturnWell();
        testFactorialGivenWrongArgumentMinus1ThrowException();

    }
    public static void testFactorialGivenWrongArgumentMinus1ThrowException(){
        MathUtility.getFactorial( -1);
        // chạy hàm này thấy ngoại lệ bung ra, mừng rơi nc mắt
        // vì đưa -1 mà hàm ném ra ngoại lệ nghĩa là hàm chạy đúng do data cà chón2
    }
    public static void testFactorialGivenRightArgument0ReturnWell(){
        int n = 0;   //0!
        long expectedResult = 1; //hy vọng trả về
        long actualResult = MathUtility.getFactorial(n);//thực tế sẽ là thấy
        //đi so sánh 2 giá trị coi expected == actual???
        System.out.println("Expected: " + expectedResult  + " Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); //true or false

}
    public static void testFactorialGivenRightArgument5ReturnWell(){
        int n = 5;   //0!
        long expectedResult = 120; //hy vọng trả về
        long actualResult = MathUtility.getFactorial(n);//thực tế sẽ là thấy

        //đi so sánh 2 giá trị coi expected == actual???
        System.out.println("Expected: " + expectedResult  + "vs.Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); //true or false

    }

    public static void testFactorialGivenRightArgument1ReturnWell(){
        int n = 1;   //0!
        long expectedResult = 1; //hy vọng trả về
        long actualResult = MathUtility.getFactorial(n);//thực tế sẽ là thấy

        //đi so sánh 2 giá trị coi expected == actual???
        System.out.println("Expected: " + expectedResult  + "vs.Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); //true or false

    }

    public static void testFactorialGivenRightArgument21ReturnWell(){
        int n = 21;   //0!
        long expectedResult = 00; //hy vọng trả về
        long actualResult = MathUtility.getFactorial(n);//thực tế sẽ là thấy

        //đi so sánh 2 giá trị coi expected == actual???
        System.out.println("Expected: " + expectedResult  + "vs.Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); //true or false

    }
}