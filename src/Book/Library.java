import java.util.Random;
import java.util.Scanner;

public class Library {
    private String libraryName;
    private Book[] bookList;
    private static int numberOfBooks;
    public static final int MAX_NUMBER_OF_BOOKS=100;

    public Library(String name){
        this.libraryName=name;
        bookList=new Book[MAX_NUMBER_OF_BOOKS];
        numberOfBooks=0;
        numberOfBooks+=1;
        bookList[0]=new Book(111,"Hanh Trinh Ve Phuong Dong",2);
        numberOfBooks+=1;
        bookList[1]=new Book(112,"Dac Nhan Tam",3);
        numberOfBooks+=1;
        bookList[2]=new Book(113,"Toi Tai Gioi, Ban Cung The",5);
        numberOfBooks+=1;
        bookList[3]=new Book(114,"Xach Ba Lo Len Va Di",1);
    }
    // Add New Book Method
    public void addNewBook() {
        numberOfBooks += 1;
        if (numberOfBooks <= MAX_NUMBER_OF_BOOKS) {

            bookList[numberOfBooks-1]=new Book();
            Scanner in =new Scanner(System.in);

            System.out.println("Enter book's information:");
            System.out.print("(1)Book ID: ");
            bookList[numberOfBooks-1].setBookID(Integer.parseInt(in.nextLine()));

            //check xem co trung bookID ko
            while(true){
                //tmp=1: da ton tai, tmp=0: thoa man
                int tmp=0;
                for(int i=0;i<(numberOfBooks-1);i++){
                    if (bookList[numberOfBooks-1].getBookID()==bookList[i].getBookID())
                        tmp=1;

                }
                if (tmp==0)
                    break;
                else{
                    System.out.print("(1)Book ID: ");
                    bookList[numberOfBooks-1].setBookID(Integer.parseInt(in.nextLine()));
                }
            }

            System.out.print("(2)Book Title: ");
            bookList[numberOfBooks-1].setBookTitle(in.nextLine());
            System.out.print("(3)Amount: ");
            bookList[numberOfBooks-1].setAmount(Integer.parseInt(in.nextLine()));
            bookList[numberOfBooks-1].setAvailable(bookList[numberOfBooks-1].getAmount());


        } else
            return;
    }

    // Find Book Method
    public boolean findBook(int bookID){
        boolean check=false;
        for(int i=0;i<numberOfBooks;i++){
            if (bookList[i].getBookID()==bookID){
                check=true;
                bookList[i].showBookInfo();
                return check;
            }
        }
        return check;
    }

    // Borrow Book Method
    public void borrowBook(int bookID){
        int idxBook=0;
        for(int i=0;i<numberOfBooks;i++){
            if(bookList[i].getBookID()==bookID){
                idxBook=i;
                break;
            }
        }
        if(bookList[idxBook].getAvailable()>0){
            System.out.println("Book title: "+ bookList[idxBook].getBookTitle());
            System.out.println("BookID: "+bookList[idxBook].getBookID());
            System.out.println("Total amount: "+bookList[idxBook].getAmount());
            System.out.println("Left amount: "+bookList[idxBook].getAvailable());

            bookList[idxBook].setAvailable(bookList[idxBook].getAvailable()-1);

            System.out.println("The book is borrowed successfully!");
            System.out.println("Book title: "+ bookList[idxBook].getBookTitle());
            System.out.println("BookID: "+bookList[idxBook].getBookID());
            System.out.println("Total amount: "+bookList[idxBook].getAmount());
            System.out.println("Left amount: "+bookList[idxBook].getAvailable());
            return;
        }
        else
            return;

    }

    // Return Book Method
    public void returnBook(int bookID){
        int idxBook=0;
        for(int i=0;i<numberOfBooks;i++){
            if(bookList[i].getBookID()==bookID){
                idxBook=i;
                break;
            }
        }
        bookList[idxBook].setAvailable(bookList[idxBook].getAvailable()+1);
        System.out.println("The book is returned successfully");
        System.out.println("Book title: "+ bookList[idxBook].getBookTitle());
        System.out.println("BookID: "+bookList[idxBook].getBookID());
        System.out.println("Total amount: "+bookList[idxBook].getAmount());
        System.out.println("Left amount: "+bookList[idxBook].getAvailable());

        return;

    }

    //Show Library Information Method
    public void showLibraryInfo(){
        System.out.println("Library Name: "+libraryName);
        System.out.println("Number of current Books:"+numberOfBooks);
        System.out.println("Books List:");
        for(int i=0;i<numberOfBooks;i++){
            System.out.println(bookList[i].getBookTitle());
        }
        return;
    }

    //Find Book Method overload
    public boolean findBook(String keyword){
        boolean check=false;
        keyword=keyword.toLowerCase();
        keyword=keyword.trim();
        String[] keywords=keyword.split(" ");
        for(int i=0;i<numberOfBooks;i++){
            check=false;
            bookList[i].setBookTitle(bookList[i].getBookTitle().trim());
            String bookTitle=bookList[i].getBookTitle();
            bookTitle=bookTitle.toLowerCase();

            for (int j = 0; j<keywords.length; j++){
                if(bookTitle.contains(keywords[j])){
                    check=true;
                }
            }
            if (check)
                bookList[i].showBookInfo();

        }

        return check;
    }

    //Get A Lucky Book Method
    public Book getALucKyBook(){
        int idxBook=new Random().nextInt(numberOfBooks);
        Book luckyBook=bookList[idxBook];
        bookList[idxBook].setAvailable(bookList[idxBook].getAvailable()-1);
        return luckyBook;
    }

}
