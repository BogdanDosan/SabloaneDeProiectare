package models;

public class Table implements Element,Visitee {
    int rows, cols;
    public Table(int r, int c){
        rows = r;
        cols = c;
    }
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitTable(this);
    }
    public int getRows() {
        return rows;
    }
    public int getCols(){
        return cols;
    }