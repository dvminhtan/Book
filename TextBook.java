package Book;

import java.util.Scanner;

public class TextBook extends Book {
    private enum  status{};
    Date d = new Date();
    @Override
    public void input() {
        System.out.println("\tINPUT INFORMATION TEXTBOOK");
        inputCommentInfor();
     //   System.out.print("Status TextBook: "+status.values());
    }

    @Override
    public void output() {
        System.out.println("\tSHOW INFORMATION TEXTBOOK");
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\tId Book: ").append(idBook);
        builder.append("\tDate: ").append(d.toString());
        builder.append("\tUnit Price: ").append(unitPrice);
        builder.append("\tAmount: ").append(amount);
        builder.append("\tPublisher book: ").append(publisher);
    //    builder.append("Status book: ").append(status.values());
        return builder.toString();
    }
}

