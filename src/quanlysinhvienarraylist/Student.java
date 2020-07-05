package quanlysinhvienarraylist;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String classStudent;
    private String sex;

    public Student() {
    }

    public Student(int id, String name, String classStudent, String sex) {
        this.id = id;
        this.name = name;
        this.classStudent = classStudent;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classStudent='" + classStudent + '\'' +
                ", sex='" + sex + '\'' +
                '}';
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

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
