/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vancuong.mathutil.main;

import com.vancuong.mathutil.core.MathUtil;

/**
 *
 * @author VanCuong
 */
public class Main {

    public static void main(String[] args) {
        // thử nghiệm hàm tính giai thừa coi chạy đúng thiết kế hay không
        // ta phải đưa các tính huống sử dụng hàm trong thực tế
        // ví dụ đưa vào: -5 , 0, 20, 21 
        long expected = 120;// kì vọng 120 nếu tính 5!
        int n = 5; // input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}
