package models;

public interface Visitor {
    void visitBook(Book b);
    void visitSection(Section s);
    void visitTOC(TableOfContents toc);
    void visitParagraph(Paragraph p);
    void visitImageProxy(ImageProxy imgPr);
    void visitImage(Image img);
    void visitTable(Table t);
}