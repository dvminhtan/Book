package Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookList {
    List<Book> books = new ArrayList<>();

    public void execution() {
        Scanner sc = new Scanner(System.in);
        int selection;
        boolean b = true;
        while (b) {
            showMenu();
            System.out.print("Enter your selection: ");
            selection = Integer.parseInt(sc.nextLine());
            switch (selection) {
                case 1:
                    input(selection);
                    break;
                case 2:
                    input(selection);
                    break;
                case 3:
                    output();
                    break;
                case 0:
                    b = false;
                    break;
                default:
                    System.out.println("Not Correct. Please try again");
                    break;
            }

        }
    }


    private void input(int type) {
        Book book = null;
        if (type == 1) {
            book = new TextBook();
        } else {
            book = new ReferenceBook();
        }
        book.input();
        books.add(book);
    }

    private void output() {
        for (Book b : books) {
            b.output();
        }
    }

    private void showMenu() {
        System.out.println("============SHOW MENU==============");
        System.out.println("\t1.Add a TextBook");
        System.out.println("\t2.Add a ReferenceBook");
        System.out.println("\t3.Show Information Books");
        System.out.println("\t4.Total amount");
        System.out.println("\t5.Average price Books");
        System.out.println("\t6.Show Information Publisher");
        System.out.println("\t0.Finish");
    }
}
