package bai10.mapvstree.thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student1 implements Comparable <Student1> {
    private String name;
    private Integer age;
    private String address;

    public Student1(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student1 student1) {
        return this.getName().compareTo(student1.getName());
    }

    public static void main(String[] args) {
        Student1 student = new Student1("Kien", 30, "HT");
        Student1 student1 = new Student1("Nam", 26, "HN");
        Student1 student2 = new Student1("Anh", 38, "HT" );
        Student1 student3 = new Student1("Tung", 38, "HT" );

        List<Student1> lists = new ArrayList<Student1>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student1 st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student1 st : lists){
            System.out.println(st.toString());
        }
    }
}
