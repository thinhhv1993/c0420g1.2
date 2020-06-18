package bai9.stackvsqueuevsset.baitap;

import java.util.*;

public class ToChucDuLieuHopLyDemergingSuDungQueue {
    public static class Student implements Comparable<Student> {
        private String name;
        private String gender;
        private String birthDay;

        public Student() {
        }

        public Student(String name, String gender, String birthDay) {
            this.name = name;
            this.gender = gender;
            this.birthDay = birthDay;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }


        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getBirthDay() {
            return birthDay;
        }

        public void setBirthDay(String birthDay) {
            this.birthDay = birthDay;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", birthDay='" + birthDay + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Student student) {
            return this.gender.compareTo(student.gender);
        }
    }

    public static void main(String[] args) {
//        Queue<Student> male = new LinkedList<>();
//        Queue<Student> female = new LinkedList<>();
//        int size = 5;
//        Student[] students = new Student[size];
/*
        students[0] = new Student("Huy", "Male", "23/05/1990");
        students[1] = new Student("Duong", "Male", "21/02/1990");
        students[2] = new Student("Nhung", "Female", "13/04/1990");
        students[3] = new Student("Minh", "Male", "25/12/1990");
        students[4] = new Student("Linh", "Female", "19/05/1990");
        for (int i = 0; i < size; i++) {
            if (students[i].getGender().equals("Male")) {
                male.add(students[i]);
            } else if (students[i].getGender().equals("Female")) {
                female.add(students[i]);
            }
        }
        while (!female.isEmpty()) {
            System.out.println(female.remove().toString());
        }
        while (!male.isEmpty()) {
            System.out.println(male.remove().toString());
        }
    }
*/
        List<Student> listStudents = new ArrayList<Student>();
        listStudents.add(new Student( "Vinh", "Male", "23/05/1990"));
        listStudents.add(new Student( "Vinh", "FeMale", "23/05/1990"));
        listStudents.add(new Student( "Vinh", "Male", "23/05/1990"));
        listStudents.add(new Student( "Vinh", "FeMale", "23/05/1990"));
        listStudents.add(new Student( "Vinh", "FeMale", "23/05/1990"));
        listStudents.add(new Student( "Vinh", "FeMale", "23/05/1990"));
        listStudents.add(new Student( "Vinh", "Male", "23/05/1990"));
        listStudents.add(new Student( "Vinh", "FeMale", "23/05/1990"));
        listStudents.add(new Student( "Vinh", "Male", "23/05/1990"));
        listStudents.add(new Student( "Vinh", "FeMale", "23/05/1990"));
        listStudents.add(new Student( "Vinh", "Male", "23/05/1990"));
        Collections.sort(listStudents);
        for (Student  student :listStudents) {
            System.out.println(student.toString());
        }
    }
}
