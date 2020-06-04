package PhuongThuc.thuchanh.timgiatrinhonhattrongmangsudungphuongthuc;

public class main {
    //Cài đặt nguyên mẫu phương thức.
    public static int minValue(int[] array){
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j ;
            }
        }
        return index;
    }
    // Tạo phương thức main() để thực thi chương trình.
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất ở vị trí thứ " + (index + 1) + " " + " có giá trị : " + arr[index]);
    }
}
