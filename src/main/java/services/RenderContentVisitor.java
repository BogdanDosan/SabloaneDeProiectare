package services;

import models.*;

public class RenderContentVisitor implements models.Visitor {

    public void visitAn(An an){
        System.out.println("An: " + an.getNumeAn());
        for (Element e : an.getElements()){
            ((Visitee) e).accept(this);
        }
    }
    public void visitGrupa(Grupa gr){
        System.out.println("Grupa: " + gr.getNumeGrupa();
        for (Element e : gr.getElements()){
            ((Visitee) e).accept(this);
        }
    }

    public void visitSubgrupa(Subgrupa sgr){
        System.out.println("Subgrupa: " + sgr.getNumeSubgrupa());
        for (Element e : sgr.getElements()){
            ((Visitee) e).accept(this);
        }
    }

    public void visitStudent(Student s){
        int poz = 0;
        String nume = s.getNume();
        String email = s.getEmail();
        AlignStrategy alignStrategy = s.getAlignStrategy();
        while (poz < nume.length()){
            int mx = Math.min(nume.substring(poz).length(), 20);
            System.out.println(alignStrategy.align(nume.substring(poz, poz + mx)));
            System.out.print(email);
            poz += mx;
        }
    }

}