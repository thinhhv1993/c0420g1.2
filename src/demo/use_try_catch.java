package demo;

public class use_try_catch {
    public static void main(String[] args) {
        int num[] = {1,2,3,4};
        //Chương trình dừng lại đột ngột vì xảy ra exception
//        System.out.println(num[4]);
        //dùng try-catch để xử lý exception này
//        try {
//            System.out.println("Gia tri la: " + num[5]);
//            System.out.println("Gia tri la: " + num[3]);
//            System.out.println("Gia tri la: " + num[5]);
//        }catch (Exception ex){
//            System.out.println(ex.toString());
////            System.out.println("Lỗi không tìm thấy phần tử của mảng tại vị trí mong đợi");
//        }
//        System.out.println("Chương trình dừng lại an toàn");

        //Demo finally
        try {
            System.out.println(num[4]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Lỗi không tìm thấy phần tử của mảng tại vị trí mong đợi");
        }finally {
            System.out.println("Dòng lệnh này được thực thi dù có xảy ra exception hay không");
        }
        System.out.println("Chương trình dừng lại an toàn");

        /*1 try phải có ít nhất 1 catch hoặc finally, try có thể có nhiều catch, try-catch có thể chứa các khối
        try-catch khác
         */
    }
}
