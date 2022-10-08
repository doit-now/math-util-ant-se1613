/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtil;

/**
 *
 * @author giao.lang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This statement comes from the main() method");
        tryTDDFirst();
        //testFactorialGivenWrongArgumentThrowsException();
    }
    
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        //              hàm đc thiết kế ném về ngoại lệ!!!
        //Thấy ngoại lệ mừng rơi nước mắt khi đưa vào -5
        //thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh
        System.out.println("Hope to see the Exception | Illegal Argument Exception");
        MathUtil.getFactorial(-5);
        
    }
    
    
    //hàm này đc viết ra để dùng thử kĩ thuật viết code kiểu TDD
    //gọi thử/dùng thử hàm chính bên core/bên MathUtil
    //xem nó sai đúng ra sao, ở ngay mức khởi đầu viết hàm
    public static void tryTDDFirst() {
        
        //Test case #1 (tình huống kiểm thử hàm số 1/xài thử hàm):
        //- Input: n = 1;
        //- Gọi hàm getFactorial(1)
        //- Hy vọng hàm trả về 1, vì 1! = 1
        
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        //so sánh expected vs. actual coi chúng nó giống nhau hem?
        //giống -> hàm đúng với case đang test
        //sai   -> bug rồi!!! với case đang test
        System.out.println("Test 1! | Status: " +
                                   "Expected: " + expected +
                                  " | Actual: " + actual);
        
        
        //Test case #2 (tình huống kiểm thử số 2/xài thử hàm lần 2):
        //- Input: n = 2;
        //- Gọi hàm getFactorial(2)
        //- Hy vọng hàm trả về 2, vì 2! = 2
        System.out.println("Test 2! | Status: " +
                                   "Expected: 2" + 
                                  " | Actual: " + MathUtil.getFactorial(2));
        
    }
    
}
//TEST CASE LÀ GÌ?
//Là 1 tình huống xài app/kiểm thử app/kiểm thử tính năng/màn hình
//chức năng/xử lí của app
//Test case là tình huống kiểm thử app/chức năng mà khi đó
//ta phải 
//- đưa vào data giả/mẫu/test, 
//- đưa ra giá trị kì vọng ta mong chờ app trả ra
//sau đó chờ hàm/tính năng xử lí xong trả ra kết quả!!!
//và ta nhìn kết quả và ta so sánh với kì vọng trước đó!!!
//để kết luận hàm ổn/tính năng ổn, TEST CASE PASSED
//                                 TEST CASE FAILED





