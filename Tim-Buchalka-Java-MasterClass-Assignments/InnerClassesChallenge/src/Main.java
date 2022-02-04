import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        LinkedList<Song> playlist = new LinkedList<>();
        Album album = new Album("Ishq");
        album.addSong("Woh lamhe",4.08);
        album.addSong("Teri yaadein", 3.48);
        album.addSong("Shape of you", 3.21);
        album.addSong("tum hi ho",12.3);
        album.addSong("kaise hua",4.6);
        album.addSong("mera jahan",3.6);
        album.addSong("roya tha mai",2.36);
        album.addSong("kya mujhe pyar hai",5.36);
        album.addSong("abhi na jao chhodkar",4.13);
        album.addSong("tera ghaata",4.32);
        albums.add(album);
        albums.get(0).addToPlaylist(1,playlist);
        albums.get(0).addToPlaylist(2,playlist);
        albums.get(0).addToPlaylist(3,playlist);
        albums.get(0).addToPlaylist(4,playlist);
        albums.get(0).addToPlaylist(5,playlist);
        albums.get(0).addToPlaylist(6,playlist);
        albums.get(0).addToPlaylist(7,playlist);
        albums.get(0).addToPlaylist(8,playlist);
        albums.get(0).addToPlaylist(9,playlist);
        albums.get(0).addToPlaylist(10,playlist);
        albums.get(0).addToPlaylist(11,playlist);
        flowOfSongs(playlist);

    }
    private static void flowOfSongs(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        boolean forward = true;
        ListIterator<Song> myList = playList.listIterator();
        if (playList.size()==0){
            System.out.println("No song in the playlist");
        }
        else {
            System.out.println("Now playing "+myList.next().toString());
        }
        printMenu();
        while (flag){
            int a = scanner.nextInt();
            scanner.nextLine();
            switch (a){
                case 0:
                    System.out.println("Exiting menu...");
                    flag =false;
                    break;
                case 1:{
                    if (!forward){
                        if (myList.hasNext()){
                            myList.next();
                        }
                        forward=true;
                    }
                    if (myList.hasNext()){
                        System.out.println("Now playing "+myList.next().toString());
                    }
                    else {
                        System.out.println("You have reached the end of the list");
                        forward =false;
                    }
                    System.out.println("Choose another option ");
                    break;
                }
                case 2:{
                    if (forward){
                        if (myList.hasPrevious()){
                            myList.previous();
                        }
                        forward = false;
                    }
                    if (myList.hasPrevious()){
                        System.out.println("Now playing "+myList.previous().toString());
                    }
                    else{
                        System.out.println("There is no previous song");
                        forward =true;
                    }
                    System.out.println("Choose another option ");
                    break;

                }
                case 3:{
                    if (forward){
                        if (myList.hasPrevious()){
                            System.out.println("Replaying song "+myList.previous().toString());
                            forward = false;
                        }
                        else System.out.println("We are at the start of playlist");
                    }
                    else {
                        if (myList.hasNext()){
                            System.out.println("Replaying song "+myList.next().toString());
                            forward = true;
                        }
                        else System.out.println("We are at the end of the list");

                    }
                    System.out.println("Choose another option");
                    break;
                }
                case 4: {
                    printPlaylist(playList);
                    System.out.println("Choose another option");
                    break;
                }
                case 6:{
                    printMenu();
                    System.out.println("Choose an option");
                    break;
                }
                case 5:{
                    if (playList.size()>0){
                        myList.remove();
                        System.out.println("Current song has been removed");
                        if (myList.hasNext()){
                            System.out.println("Now playing "+ myList.next().toString());
                        }
                        else if (myList.hasPrevious()){
                            System.out.println("Now playing "+myList.previous().toString());
                        }
                    }
                    else{
                        System.out.println("Playlist is empty");
                    }
                    System.out.println("Choose another option");
                    break;
                }
                default:{
                    System.out.println("Choose valid option");
                }

            }
        }
    }
    private static void printMenu(){
        System.out.println("Press 0 to exit the menu");
        System.out.println("Press 1 to play next song");
        System.out.println("Press 2 to play previous song");
        System.out.println("Press 3 to replay the current song");
        System.out.println("Press 4 to show songs in the play list");
        System.out.println("Press 5 to delete current song");
        System.out.println("Press 6 to show available options");
    }
    private static void printPlaylist(LinkedList<Song> playlist){
        Iterator<Song> iterator =playlist.iterator();
        System.out.println("******************************");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("******************************");
    }
}
