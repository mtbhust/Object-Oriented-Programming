package BkLib;

public class Book {
    private String bookID;
    private String bookTitle;
    private String importedDay;
    private int unit;
    private int quantity;
    private String publishingCompany;
    private double bill;

    public Book (String bookID, String bookTitle, String importedDay, int unit, int quantity, String publishingCompany) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.importedDay = importedDay;
        this.unit = unit;
        this.quantity = quantity;
        this.publishingCompany = publishingCompany;
    }

    public String getBookID () {
        return bookID;
    }

    public void setBookID (String bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle () {
        return bookTitle;
    }

    public void setBookTitle (String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getImportedDay () {
        return importedDay;
    }

    public void setImportedDay (String importedDay) {
        this.importedDay = importedDay;
    }

    public int getUnit () {
        return unit;
    }

    public void setUnit (int unit) {
        this.unit = unit;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    public String getPublishingCompany () {
        return publishingCompany;
    }

    public void setPublishingCompany (String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }
    public void export() {
        String a = String.format("%s, %s, %s, %d, %d, %s", bookID, bookTitle, importedDay, unit, quantity, publishingCompany);
        System.out.println(a);
    }
}
