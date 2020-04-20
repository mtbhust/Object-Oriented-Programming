package BkLib;

public class referenceBook extends Book {
    private String field;
    private double tax;
    private double bill;

    public referenceBook (String bookID, String bookTitle, String importedDay, int unit, int quantity, String publishingCompany, String field, double tax) {
        super(bookID, bookTitle, importedDay, unit, quantity, publishingCompany);
        this.field = field;
        this.tax = tax;
        this.bill = quantity*unit + tax;
    }

    public String getField () {
        return field;
    }

    public void setField (String field) {
        this.field = field;
    }

    public double getTax () {
        return tax;
    }

    public void setTax (double tax) {
        this.tax = tax;
    }

    public double getBill () {
        return bill;
    }
}
