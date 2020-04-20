package BkLib;

public class textBook extends Book{
    private String state;
    private double bill;
    public textBook (String bookID, String bookTitle, String importedDay, int unit, int quantity, String publishingCompany, String state) {
        super(bookID, bookTitle, importedDay, unit, quantity, publishingCompany);
        this.state = state;
        if (state == "new") {
            this.bill = quantity*unit;
        }
        else {
            this.bill = (quantity*unit)/2;
        }
    }

    public String getState () {
        return state;
    }

    public void setState (String state) {
        this.state = state;
    }

    public double getBill () {
        return bill;
    }

}
