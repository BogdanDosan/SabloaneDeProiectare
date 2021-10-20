package RO.UVT.SABLOANE;

public class Paragraph extends Element {
    private final String text;

    public Paragraph(String text){
        this.text = text;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                '}';
    }
}