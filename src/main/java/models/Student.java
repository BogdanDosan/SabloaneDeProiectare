package models;

import services.AlignLeft;
import services.AlignStrategy;

public class Student implements Element, Visitee{
    String nume, email;
    AlignStrategy alignStrategy;

    public Student(String numeStudent, String e){
        nume = numeStudent;
        email = e;
        alignStrategy = new AlignLeft();
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitStudent(this);
    }
    public void setAlignStrategy(AlignStrategy as){
        alignStrategy = as;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public AlignStrategy getAlignStrategy(){
        return alignStrategy;
    }
}