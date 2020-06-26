package demo;

public class unchecked_exception {
    public static void main(String[] args) {
        System.out.println("Đã chạy chương trình");
        int number1 = Integer.parseInt("1");
        /*
        Trường hợp này chúng ta muốn parse 1 chuỗi sang kiểu float
        nhưng khi chạy bộ compile không phát hiện và đến lúc runtime
        phương thức parseFloat phát sinh lỗi được gọi là ngoại lệ unchecked
         */
        float number2 = Float.parseFloat("1.3a");
        System.out.println(number1);
        System.out.println(number2);
    }
}
