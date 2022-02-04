public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,false);
         int pagesPrinted = printer.printPages(4);
        System.out.println(pagesPrinted);
        pagesPrinted = printer.printPages(2);
        System.out.println("new= "+pagesPrinted+" total= "+printer.getTotalPages());
    }
}
