package base;

public class Document {

    private String documentNumber;

    public Document(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public final String getDocumentInfo() {
        return "Document number: " + getDocumentNumber();
    }

    public String getDocumentNumber() {
        return documentNumber;
    }
}
