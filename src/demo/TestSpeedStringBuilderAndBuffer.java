public class TestSpeedStringBuilderAndBuffer {
    public static void main(String[] args) {
        //Lấy thời gian hiện tại của hệ thống
        long startTime = System.currentTimeMillis();

        //Khai báo StringBuffer và nối chuỗi 100000 lần
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000000; i++) {
            sb.append("Hello");
        }
        //Hiển thị thời gian thực hiện
        System.out.println("Thời gian nối chuỗi của StringBuffer: "
                + (System.currentTimeMillis() - startTime) + "ms");

        //Thao tác tương tự như trên với StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 10000000; i++) {
            sb2.append("Hello");
        }
        System.out.println("Thời gian nối chuỗi của StringBuilder: "
                + (System.currentTimeMillis() - startTime) + "ms");
    }
}
