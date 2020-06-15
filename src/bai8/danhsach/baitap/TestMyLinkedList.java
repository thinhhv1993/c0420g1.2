package bai8.danhsach.baitap;

public class TestMyLinkedList {
    public static class Student{
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
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student0 = new Student(1,"thịnh");
        Student student1 = new Student(2,"thịnh");
        Student student2 = new Student(3,"thịnh");
        Student student3 = new Student(4,"thịnh");
        Student student4 = new Student(5,"thịnh");

//        myLinkedList.addFirst(student0);
//        myLinkedList.addLast(student1);
//        myLinkedList.add(3,student2);
//        myLinkedList.addFirst(student3);
//        myLinkedList.addFirst(student4);
//        myLinkedList.clear();

//        for(int i = 0 ; i < myLinkedList.size(); i++){
//            Student student = (Student) myLinkedList.get(i);
//            System.out.print(student.getId() + "\t");
//            System.out.println(student.getName());
//        }
        Student student = (Student) myLinkedList.getFirst();
        if(student == null){
            return ;
        }else {
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
}
