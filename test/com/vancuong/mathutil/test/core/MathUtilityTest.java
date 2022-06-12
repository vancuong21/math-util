/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vancuong.mathutil.test.core;

import com.vancuong.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author VanCuong
 */
public class MathUtilityTest {

    // dây là class sẽ sử dụng các hàm của thư viện JUnit để kiếm tra code chính
    // viết code để test code chính bên kia!!!
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; // test thử tình huống đầu vào
        long extecped = 1; // hy vọng 0! = 1
        //long actual = ; // gọi hàm cần test bên core/app chính
        long actual = MathUtil.getFactorial(n);

        // so sánh extected với actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(extecped, actual); // hàm giúp so sánh 2 giá trị nào đó có giống nhau hay k

        // gộp thêm vài case thành công
        Assert.assertEquals(1, MathUtil.getFactorial(1)); // tui muốn 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); // muốn 2! == 2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); // muốn 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
    }

    // hàm getF() ta thiết kế có 2 tình huống xử lí
    // 1. đưa data tử tế 
    // 2. đưa data cà chớn , âm, >20; thiết kế ném ra ngoại lệ
    // ngoại lệ xuất hiện=> test XANH xuất hiện
    // không thể đo lường so sánh kiểu value
    // chỉ có thể đo lường = cách chúng xuất hiện hay không
    // MÀU ĐỎ ĐÓ EM, DO HÀM ĐÚNG LÀ NÉM RA NGOẠI LỆ THẬT
    //              NHƯNG KHÔNG PHẢI NGOẠI LỆ NHƯ KỲ VỌNG
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy
//                                    // sẽ ném về ngoại lệ NumberFormat..
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy
        // sẽ ném về ngoại lệ NumberFormat..
    }

    // CÁCH KHÁC ĐỂ BẮT NGOẠI LỆ XUẤT HIỆN !!!
    // xài Lambda
    // test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(-5));

    }

    //Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay không khi n cà chớn
    // có ném , tức là hàm chạy đúng thiết kế -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            Assert.assertEquals("Invalid argument. N must be betwen 0..20", e.getMessage());
        }

    }
}
