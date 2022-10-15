/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author giao.lang
 */
//đây là class mô phỏng lại các hàm tiện ích/dùng chung cho mọi
//class khác, mô phỏng lại class tiện ích java.Math của JDK
//Phàm cái gì là đồ dùng chung, thường đc thiết kế là static
public class MathUtil {

    public static final double PI = 3.141592653589793;

    //Hàm tiện ích tính n! = 1.2.3...n
    //Lưu ý/quy ước:
    //- Không tính giai thừa số âm!!!
    //0! = 1! = 1
    //Vì giai thừa tăng cực nhanh, nên 21! đã vượt 18 số 0
    //tràn kiểu long.
    //Ta ko tính 21! trở lên
    
    //SỬA HÀM TÍNH GIAI THỪA = CÁCH XÀI ĐỆ QUY!!!
    //n! = 1.2.3.4.5...n
    //5! = 1.2.3.4.5
    //5! = 4! x 5 = 5 x 4!
    //4! = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1!
    //1! = 1 chốt dừng dội ngược lên
    //n! = n x (n - 1)! công thức đệ quy
    //N! = RETURN N X (N - 1)!
    //ĐỆ QUY: GỌI LẠI CHÍNH MÌNH VỚI 1 QUY MÔ KHÁC/NHỎ HƠN
    //CON BÚP BÊ NGA
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
      
        if (n == 0 || n == 1)   //CHỐT DỪNG
            return 1;
        
       return n * getFactorial(n - 1);
    }
    
//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
//      
//        if (n == 0 || n == 1) 
//            return 1;
//        
//        //sống sót đến đây, sure n = 2...20!!!
//        //CẤM KO XÀI ELSE NỮA KHI HÀM ĐÃ CÓ RETURN PHÍA TRƯỚC
//        long product = 1; //biến cộng dồn, nhân dồn, biến con heo đất
//        //acc/accumulation/gửi góp
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//    }
}
//CODING CONVENTION: QUY TẮC VIẾT CODE CTY ÉP PHẢI THEO!!!
//ALT-SHIFT-F CĂN CODE TỰ ĐỘNG, KO LẠM DỤNG

//TA HỌC SƠ VỀ KHÁI NIỆM TDD - TEST DRIVEN DEVELOPMENT
//LÀ KĨ THUẬT LẬP TRÌNH/ÁP DỤNG CHO DÂN DEVELOPER ĐỂ GIA TĂNG
//CHẤT LƯỢNG CODE/GIẢM THIỂU CÔNG SỨC TÌM BUG/PHÁT HIỆN BUG SỚM
//TDD yêu cầu dev khi viết code/viết hàm/class phải viết luôn
//các bộ kiểm thử/viết luôn các test cases/viết luôn các đoạn
//code dùng thử hàm/class để kiểm tra tính đúng đắn của hàm/class
//viết code kèm với viết test cases
//viết code có ý thức viết luôn phần kiểm thử code/hàm/class
//  development driven                       test   
//SAU KHI CÓ ĐC TÊN HÀM (CHỈ TÊN HÀM MÀ THOY)
//TA VIẾT LUÔN CÁC TÌNH HUỐNG XÀI HÀM
//CHẤP NHẬN KHI CHẠY HÀM CHẠY SAI - DO CODE CHƯA XONG
//SAU ĐÓ TA TỐI ƯU/CHỈNH SỬA CODE ĐỂ ĐẢM BẢO CODE CHẠY ĐÚNG!!!
//QUÁ TRÌNH SAI - ĐÚNG - SAI - ĐÚNG diễn ra liên tục (cycle)

