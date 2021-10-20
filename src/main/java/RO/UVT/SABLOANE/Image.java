package RO.UVT.SABLOANE;

public class Image extends Element {
    private final String url;

    public Image(String url){
        this.url = url;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Image{" +
                "url='" + url + '\'' +
                '}';
    }
}