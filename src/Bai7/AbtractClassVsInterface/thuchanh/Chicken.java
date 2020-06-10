package Bai7.AbtractClassVsInterface.thuchanh;

public class Chicken extends Animal implements Edible {
    @Override
    public String makesound() {
        return "ò ó o ... o";
    }

    @Override
    public String howtoEat() {
        return "";
    }
}
