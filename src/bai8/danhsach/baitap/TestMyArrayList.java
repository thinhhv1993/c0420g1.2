package bai8.danhsach.baitap;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Student student0 = new Student(2, "Thinh");
        Student student2 = new Student(1, "Thinh");
        Student student1 = new Student(3, "Thinh");
        Student student3 = new Student(4, "Thinh");
        Student student4 = new Student(5, "Thinh");
        Student student5 = new Student(6, "Thinh");
        Student student6 = new Student(6, "Thinh");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> studentMyArrayList1 = new MyArrayList<>();
        studentMyArrayList.add(student0);
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5, 1);
        System.out.println(studentMyArrayList.remove(3));
//        for (int i = 0; i < studentMyArrayList.size(); i++ ){
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
//
//        System.out.println(studentMyArrayList.get(5).getId());

//        System.out.println(studentMyArrayList.contains(student1));
//        studentMyArrayList1 = studentMyArrayList.clone();
//        Student student = studentMyArrayList1.remove(1);
//        System.out.println(student.getName());
//        for (int i = 0; i < studentMyArrayList1.size(); i++) {
//            Student student = (Student) studentMyArrayList1.elements[i];
//            System.out.print(student.getId());
//            System.out.println(student.getName());
//        }
        
    }
}
