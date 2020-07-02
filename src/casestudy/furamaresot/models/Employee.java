package casestudy.furamaresot.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String id ;
    private String fullName;
    private int age;
    private String address;

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(String id, String fullName, int age, String address) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public Employee() {
    }

    public Map<Integer,Employee> addEmployee(){
        final String FILE_PATH = "src\\casestudy\\furamaresot\\data";
        Map<Integer, Employee> map = new HashMap<>();
        BufferedReader bufferedReader ;
        try {
            FileReader fileReader = new FileReader(FILE_PATH + "\\Employee.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Employee employee;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                employee = new Employee(arrStr[0], arrStr[1],Integer.parseInt(arrStr[2]), arrStr[3]);
                map.put(Integer.parseInt(arrStr[0]),employee);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public void showInformationOfEmployee(){
        for(Integer key : addEmployee().keySet()){
            System.out.println(addEmployee().get(key));
        }
    }
}
