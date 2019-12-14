package Book;

import java.util.Scanner;

public class ReferenceBook extends Book {
    private float taxation;

    @Override
    public void input() {
        System.out.println("\tINPUT INFORMATION REFERENCEBOOK");
        Scanner sc = new Scanner(System.in);
        inputCommentInfor();
        System.out.print("Taxation: ");
        taxation = sc.nextFloat();

    }

    @Override
    public void output() {
        System.out.println("\tSHOW INFORMATION REFERENCE BOOK");
        System.out.println(this);

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\tId Book: ").append(idBook);
//        builder.append("\tDate: ").append(date);
        builder.append("\tUnit Price: ").append(unitPrice);
        builder.append("\tAmount: ").append(amount);
        builder.append("\tPublisher book: ").append(publisher);
        builder.append("\tTaxation: ").append(taxation);
        return builder.toString();
    }
}
