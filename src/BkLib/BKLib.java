package BkLib;
import java.util.*;
public class BKLib {
    ArrayList<Object> bookList;
    ArrayList<textBook> textBooks;
    ArrayList<referenceBook> referenceBooks;
    ArrayList<foreignLanguageBook> foreignLanguageBooks;

    static Scanner input = new Scanner(System.in);
    public BKLib(){
        bookList = new ArrayList<Object>();
        textBooks = new ArrayList<textBook>();
        referenceBooks = new ArrayList<referenceBook>();
        foreignLanguageBooks = new ArrayList<foreignLanguageBook>();
        bookList.add(textBooks);
        bookList.add(referenceBooks);
        bookList.add(foreignLanguageBooks);
    }
    public void importBook () {
        String cont = "Co";
        while(cont == "Co"){
            System.out.println("Chon loai sach: ");
            System.out.println("1. Sach giao khoa ");
            System.out.println("2. Sach tham khao ");
            System.out.println("3. Sach ngoai van ");
            int choice = Integer.parseInt(input.nextLine());
            if ( choice == 1 ) {
                System.out.println("Ma Sach: ");
                String bookID = input.nextLine();
                System.out.println("Tieu De: ");
                String title = input.nextLine();
                System.out.println("Ngay nhap: ");
                String importDay = input.nextLine();
                System.out.println("Don gia: ");
                int unit = Integer.parseInt(input.nextLine());
                System.out.println("So luong: ");
                int quantity = Integer.parseInt(input.nextLine());
                System.out.println("Nha xuat ban: ");
                String pubCompany = input.nextLine();
                System.out.println("Tinh trang (Moi/Cu): ");
                String state = input.nextLine();
                textBook temp = new textBook(bookID, title, importDay, unit, quantity, pubCompany, state);
                textBooks.add(temp);
            }
            else if ( choice == 2) {
                System.out.println("Ma Sach: ");
                String bookID = input.nextLine();
                System.out.println("Tieu De: ");
                String title = input.nextLine();
                System.out.println("Ngay nhap: ");
                String importDay = input.nextLine();
                System.out.println("Don gia: ");
                int unit = Integer.parseInt(input.nextLine());
                System.out.println("So luong: ");
                int quantity = Integer.parseInt(input.nextLine());
                System.out.println("Nha xuat ban: ");
                String pubCompany = input.nextLine();
                System.out.println("Chuyen nganh: ");
                String field = input.nextLine();
                System.out.println("Thue: ");
                double tax = Integer.parseInt(input.nextLine());
                referenceBook temp = new referenceBook(bookID, title, importDay, unit, quantity, pubCompany, field, tax);
                referenceBooks.add(temp);
            }
            else if ( choice == 3) {
                System.out.println("Ma Sach: ");
                String bookID = input.nextLine();
                System.out.println("Tieu De: ");
                String title = input.nextLine();
                System.out.println("Ngay nhap: ");
                String importDay = input.nextLine();
                System.out.println("Don gia: ");
                int unit = Integer.parseInt(input.nextLine());
                System.out.println("So luong: ");
                int quantity = Integer.parseInt(input.nextLine());
                System.out.println("Nha xuat ban: ");
                String pubCompany = input.nextLine();
                System.out.println("Ngon ngu: ");
                String language = input.nextLine();
                foreignLanguageBook temp = new foreignLanguageBook(bookID, title, importDay, unit, quantity, pubCompany, language);
                foreignLanguageBooks.add(temp);
            }
            System.out.println("Ban co muon nhap them sach (Co/khong): ");
            cont = input.nextLine();
        }
    }
    public void showList() {
        int count = 0;
        System.out.println("Danh sach cac cuon sach giao khoa: ");
        for ( textBook book : textBooks) {
            System.out.print(count + ". ");
            book.export();
            System.out.println("Bill = " + book.getBill());
        }
        count = 0;
        System.out.println("Danh sach cac cuon sach tham khao: ");
        for ( referenceBook book : referenceBooks) {
            System.out.print(count + ". ");
            book.export();
            System.out.println("Bill = " + book.getBill());
        }
        count = 0;
        System.out.println("Danh sach cac cuon sach ngoai van: ");
        for ( foreignLanguageBook book : foreignLanguageBooks) {
            System.out.print(count + ". ");
            book.export();
            System.out.println("Bill = " + book.getBill());
        }
    }
    public double avgReference() {
        double total = 0;
        int count = 0;
        for (referenceBook rfBook: referenceBooks) {
            total += rfBook.getBill();
            count ++;
        }
        return (double) total/count;
    }
    public void exportTextBook(String X) {
        for (textBook tBook : textBooks) {
            if (tBook.getPublishingCompany()== X) {
                tBook.export();
            }
        }
    }
    public static void main (String[] args) {
        BKLib test = new BKLib();
        test.importBook();
        test.showList();
        System.out.println("Trung binh don gia cua sach tham khao la:" +test.avgReference());
        System.out.println("Nhap ten nha xuat ban ban muon tim sach giao khoa: ");
        String nxb = input.nextLine();
        test.exportTextBook(nxb);
    }

}
