public class Main {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else {
            int megabytes = kiloBytes / 1024;
            int remKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megabytes + " MB and " + remKilobytes + " KB");
        }
    }
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);

    }
}
