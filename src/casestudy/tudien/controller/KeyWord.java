package casestudy.tudien.controller;

import java.io.Serializable;

public class KeyWord implements Serializable {
    private String nameKey;
    private String pronounce;
    private String type;
    private String similar;
    private StringBuilder define;

    public KeyWord() {
    }

    public KeyWord(String nameKey, String pronounce, String type, String similar, StringBuilder define) {
        this.nameKey = nameKey;
        this.pronounce = pronounce;
        this.type = type;
        this.similar = similar;
        this.define = define;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public String getPronounce() {
        return pronounce;
    }

    public void setPronounce(String pronounce) {
        this.pronounce = pronounce;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSimilar() {
        return similar;
    }

    public void setSimilar(String similar) {
        this.similar = similar;
    }

    public StringBuilder getDefine() {
        return define;
    }

    public void setDefine(StringBuilder define) {
        this.define = define;
    }

    @Override
    public String toString() {
        return "KeyWord " + '\n' +
                " NameKey : " + nameKey + '\n' +
                " Pronounce : " + pronounce + '\n' +
                " Type : " + type + '\n' +
                " Similar : " + similar + '\n' +
                " Define : " + define + '\n' ;
    }
}
