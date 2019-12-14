package Book;

import java.util.Scanner;

public class Date {
    protected int date;
    protected int month;
    protected int year;
    public void inputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Add a date:");
        date = sc.nextInt();
        System.out.println("Add a month:");
        month = sc.nextInt();
        System.out.println("Add a year: ");
        year  =sc.nextInt();
    }

    @Override
    public String toString() {
        return "Data{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
//
//    public void outputDate(){
//        System.out.println("Date: ");
//        System.out.println(this);
//    }
}
