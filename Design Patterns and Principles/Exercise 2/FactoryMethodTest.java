package Exercise2;

public class FactoryMethodTest {
    public static void main(String[] args) {
        DocumentFactory wf= new WordDocumentFactory();
        Document w= wf.createDocument();
        w.open();
        DocumentFactory pf= new PdfDocumentFactory();
        Document p= pf.createDocument();
        p.open();
        DocumentFactory ef= new ExcelDocumentFactory();
        Document e= ef.createDocument();
        e.open();
    }
}
