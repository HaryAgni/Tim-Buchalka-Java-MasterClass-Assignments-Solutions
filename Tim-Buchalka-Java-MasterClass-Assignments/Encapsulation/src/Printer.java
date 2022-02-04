public class Printer {
    private int tonerLevel;
    private int totalPages;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else this.tonerLevel = -1;
        this.duplex = duplex;
        this.totalPages = 0;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int fillToner(int toner) {
        if ((tonerLevel + toner) > 100) {
            tonerLevel = 100;
            return tonerLevel;

        } else if (toner < 1) return -1;
        else {
            tonerLevel = tonerLevel + toner;
            return tonerLevel;
        }

    }

    public int printPages(int pages) {
        int pagesToprint = pages;
        if (duplex) {
            pagesToprint = (pages / 2) + (pages % 2);
            System.out.println("Duplex");
        }
        totalPages+= pagesToprint;
        return pagesToprint;
    }
}