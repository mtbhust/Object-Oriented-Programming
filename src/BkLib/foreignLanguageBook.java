package BkLib;

public class foreignLanguageBook extends Book {
    private String language;
    private double bill;

    public foreignLanguageBook (String bookID, String bookTitle, String importedDay, int unit, int quantity, String publishingCompany, String language) {
        super(bookID, bookTitle, importedDay, unit, quantity, publishingCompany);
        this.language = language;
        this.bill = quantity*unit*1.2;
    }

    public String getLanguage () {
        return language;
    }

    public void setLanguage (String language) {
        this.language = language;
    }

    public double getBill () {
        return bill;
    }


}
