package com.vancuong.mathutil.test.core;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.vancuong.mathutil.core.MathUtil;

// Câu lệnh này của JUnit báo cần loop qua tập data để
// lấy cặp data input/ expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    // ta sẽ trả về mề 2 chiều gồm nhiều cặp Expected | Input
    @Parameterized.Parameters // JUnit sẽ ngầm chạy loop qua từng dòng để lấy qua cặp data
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
    }

    // gán từng value của cột 
    @Parameterized.Parameter(value = 0) // value =0 map với mảng data
    public int n; // biến map với value của cột 0 của mảng
    @Parameterized.Parameter(value = 1)
    public long expected;

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));

    }
}
