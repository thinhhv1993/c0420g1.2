package bai10.mapvstree.baitap;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class DemSoLanXuatHienCua1TuTrong1ChuoiSuDungMap {
    public static void show(LinkedHashMap<String, Integer> linkedHashMap) {
        Set<String> keySet = linkedHashMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra :");
        String str = scanner.nextLine();
        str = str.replaceAll("\\p{Punct}", "");
        String[] str1 = str.split("\\ ");
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < str1.length ; i++) {
            str1[i].toLowerCase();
            int j = 1;
            for (int k = 0; k < i; k++) {
                if(str1[i].equals(str1[k])){
                    j++;
                }
            }
            linkedHashMap.put(str1[i],j);
        }
      show(linkedHashMap);

    }
}
