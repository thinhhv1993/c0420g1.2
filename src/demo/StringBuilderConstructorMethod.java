public class StringBuilderConstructorMethod {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        //Phương thức nối thêm ký tự hoặc chuỗi cho String Builder
        str.append("Welcome");
        str.append(" ");
        str.append("to");
        str.append(" ");
        str.append("Java");
        System.out.println(str);
        //Phương thức chèn thêm ký tự hoặc chuỗi cho String Builder
        str.insert(11,"HTML and ");
        System.out.println(str);
        //Phương thức delete()
        str.delete(8,11);
        System.out.println(str);
        //Phương thức deleteChartAt()
        System.out.println(str.deleteCharAt(8));
        //Phương thức reverse()
        System.out.println(str.reverse());
    }
}
