package demo;

public class a {
    static class Person {
        public int a;

        public Person(int a) {
            this.a = a;
        }
    }
    public static void swap(Person first, Person second) {
        int temp = first.a;
        first.a = second.a;
        second.a = temp;
    }

    public static void main(String[] args) {
        Person a = new Person(1);
        Person b = new Person(2);
        swap(a,b);
        System.out.println("a	=	" + a.a);
        System.out.println("b	=	" + b.a);
    }

//    static class Person {
//        public String name;
//
//        public Person(String name) {
//            this.name = name;
//        }
//    }
//
//    public static void swap(Person first, Person second) {
//        String temp = first.name;
//        first.name = second.name;
//        second.name = temp;
//    }
//
//    public static void main(String[] args) {
//        Person a = new Person("John");
//        Person b = new Person("Bill");
//        swap(a, b);
//        System.out.println("a.name	=	" + a.name);
//        System.out.println("b.name	=	" + b.name);
//
//    }
}
