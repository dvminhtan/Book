package Book;

import java.util.Scanner;

public abstract class Book implements BookService {
    protected String idBook;
    protected float unitPrice;
    protected int amount;
    protected String publisher;

    Date d = new Date();
    //@Override
    public void inputCommentInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID Book: ");
        idBook =sc.nextLine();
 //       System.out.println("Date: ");
        d.inputDate();
        System.out.print("Unit Price: ");
        unitPrice = Float.parseFloat(sc.nextLine());
        System.out.print("Amount: ");
        amount = Integer.parseInt(sc.nextLine());
        System.out.print("Publisher: ");
        publisher = sc.nextLine();
    }

}
