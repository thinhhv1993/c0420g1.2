package demo;

import java.io.File;
import java.io.FileReader;

public class checked_exception {
    public static void main(String[] args) {
        //Tạo 1 file trong ổ E
        File file = new File("E://file.txt");
        /*
        Khi muốn đọc file này Java sẽ yêu cầu handled exception để
        phòng trường hợp file này không tìm thấy
        Bộ compile của Java sẽ bắt buộc chúng
        ta phải xử lý nên đây là exception loại checked
         */
//        FileReader fileReader = new FileReader(file);
    }
}
