/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vancuong.mathutil.core;

/**
 *
 * @author VanCuong
 */
public class MathUtil {
    // trong class này cung cấp nhiều hàm xử lý toán học
    // tức là clone class Math của JDK
    // hàm thư viện xài chung, ko cần lưu lại giá trị thì chọn thiết kế là static.

    // hàm tính giai thừa !!!
    // n! = 1.2.3...n
    // ko có giai thừa âm 
    // 0! = 1! = 1 quy ước 
    // giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    // bài này quy ước tính n! trong 0...20
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be betwen 0..20");
        }

        if (n == 0 || n == 1) {
            return 1; // kết thúc nếu nhận đầu vào đặc biệt
        }
        long product = 1; // tích nhân dồn
        for (int i = 2; i <= n; i++) {
            product *= i; // product = product *i;
        }
        return product;

    }

}
