package models;

import services.AlignCenter;
import services.AlignLeft;
import services.AlignRight;
import services.RenderContentVisitor;

public class Main {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("https://cdn.pixabay.com/photo/2021/08/25/20/42/field-6574455__480.jpg"));
        cap1.add(new Image("https://images.ctfassets.net/hrltx12pl8hq/3MbF54EhWUhsXunc5Keueb/60774fbbff86e6bf6776f1e17a8016b4/04-nature_721703848.jpg?fit=fill&w=480&h=270"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table(5, 10));
//        BookStatistics stats = new BookStatistics();
        cap1.accept(new RenderContentVisitor());
//        stats.printStatistics();
    }