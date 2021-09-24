package creational.prototype;

public class GeneralEntityService {

    public Document findDocumentById(Long id) {
        Document document = new Document();
        document.setId(id);

        if (id.equals(1L)) {
            document.setName("Private Document");
        } else if (id.equals(2L)) {
            document.setName("Protected Document");
        } else {
            document.setName("Public Document");
        }
        document.setDocumentType(findDocumentTypeById(id));
        document.setDocumentCategory(findDocumentCategoryById(id));
        return document;
    }

    public DocumentType findDocumentTypeById(Long id) {
        DocumentType documentType = new DocumentType();
        documentType.setId(id);

        if (id.equals(1L)) {
            documentType.setName("Private");
        } else if (id.equals(2L)) {
            documentType.setName("Protected");
        } else {
            documentType.setName("Public");
        }
        return documentType;
    }

    public DocumentCategory findDocumentCategoryById(Long id) {
        DocumentCategory documentCategory = new DocumentCategory();
        documentCategory.setId(id);

        if (id.equals(1L)) {
            documentCategory.setName("Work");
        } else if (id.equals(2L)) {
            documentCategory.setName("Home");
        } else {
            documentCategory.setName("General");
        }
        return documentCategory;
    }

}
