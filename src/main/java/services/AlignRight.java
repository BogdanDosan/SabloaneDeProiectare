package services;

public class AlignRight implements AlignStrategy {
    public String align(String s){
        return String.format("%20s", s);
    }
}