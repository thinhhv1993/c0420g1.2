package VongLap.thuchanh.vonglapwhile;

public class main {
    public static void main(String[] args) {
        int i = 1;
        while(i < 5){
            if(i % 3 != 0){
                i++;
                continue;
            }
            System.out.println("Hello");
            i++;
        }
    }
}
