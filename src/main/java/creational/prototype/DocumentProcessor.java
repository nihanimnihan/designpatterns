package creational.prototype;

public class DocumentProcessor {

    public static void main(String[] args) {
        GeneralEntityService generalEntityService = new GeneralEntityService();
        Document document = generalEntityService.findDocumentById(1L);
        System.out.println(document);
    }
}
