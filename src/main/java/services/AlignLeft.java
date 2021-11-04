package services;

public class AlignLeft implements AlignStrategy {
    public String align(String s){
        return String.format("%-20s", s);
    }
}