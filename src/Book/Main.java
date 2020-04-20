import java.util.Scanner;

public class Main {
    private static int option;

    public static void main(String[] args){
        Library library=new Library("Thu Vien Sach To 7");
        while(true) {
            showMenu();
            askOption();
            Scanner in = new Scanner(System.in);
            if (option == 1) {
                System.out.println("1. Show library information");
                System.out.println("------------------------------");
                library.showLibraryInfo();
            } else if (option == 2) {
                System.out.println("2. Add new book");
                System.out.println("------------------------------");
                library.addNewBook();
            } else if (option == 3) {
                System.out.println("3. Find book");
                System.out.println("------------------------------");
                System.out.print("Enter book's ID or KeyWord: ");
                //check input is a digit or keyword
                String input = in.nextLine();
                if (Character.isDigit(input.charAt(0))) {
                    int bookID = Integer.parseInt(input);
                    library.findBook(bookID);
                } else
                    library.findBook(input);

            } else if (option == 4) {
                System.out.println("4. Borrow a book");
                System.out.println("------------------------------");
                System.out.print("Enter book's ID:");
                int bookID = Integer.parseInt(in.nextLine());
                library.borrowBook(bookID);

            } else if (option == 5) {
                System.out.println("5. Return a book");
                System.out.println("------------------------------");
                System.out.print("Enter book's ID:");
                int bookID = Integer.parseInt(in.nextLine());
                library.returnBook(bookID);
            } else if (option == 6) {
                System.out.println("6. Exit");
                System.out.println("------------------------------");
                break;
            }
            System.out.println("------------------------------");
            System.out.println("GIFT FOR 30/04-01/05.");
            System.out.println("You received a book:");
            Book luckyBook = library.getALucKyBook();
            System.out.println("Book ID: " + luckyBook.getBookID());
            System.out.println("Book Title: " + luckyBook.getBookTitle());
        }

        return;
    }

    public static void showMenu(){
        System.out.println("========== Main menu ===========");
        System.out.println("1. Show library information");
        System.out.println("2. Add new book");
        System.out.println("3. Find book");
        System.out.println("4. Borrow a book");
        System.out.println("5. Return a book");
        System.out.println("6. Exit");
        System.out.println("================================");
        System.out.println("Enter menu ID (1-6):");
        return;
    }

    public static void askOption(){
        Scanner in =new Scanner(System.in);
        option=Integer.parseInt(in.nextLine());
        return;
    }
}
