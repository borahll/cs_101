package lab9;
import java.util.ArrayList;
import java.util.Scanner;
public class MusicApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String intro = "--------------------------------------------------------\nWelcome to Music App! Get Ready to create your playlist!\n--------------------------------------------------------";
        String choice = "\n1 - Create a new Playlist\n2 - Display the Playlist\n3 - Sort the Playlist\n4 - Remove song by index from the current Playlist\n5 - Display all Playlists\n6 - Exit";
        System.out.println(intro + choice);

        String input = sc.next();

        ArrayList<Playlist> playlists = new ArrayList<>();
        byte counter = 0;

        while(!input.equals("6")){
            if (input.equals("1")){
                counter++;
                String genreName = "";
                System.out.println("enter playlist name:");
                String playlistName = sc.next();

                System.out.println("Enter creator of playlist:");
                String creatorName = sc.next();

                System.out.println("0-Country\n1-Electronic\n2-Pop Music\n3-Rock Music\n4-Jazz\n5-Classical\nSelect genre of playlist :");
                String genreNameFirst = sc.next();

                if(genreNameFirst.equals("1")){genreName = "Country";}
                else if(genreNameFirst.equals("2")){genreName = "Electronic";}
                else if(genreNameFirst.equals("3")){genreName = "Pop Music";}
                else if(genreNameFirst.equals("4")){genreName = "Rock Music";}
                else if(genreNameFirst.equals("5")){genreName = "Jazz";}
                else if(genreNameFirst.equals("6")){genreName = "Classical";}

                Playlist playlist1 = new Playlist();
                playlist1.setName(playlistName);
                playlist1.setCreator(creatorName);
                playlist1.setGenre(genreName);
                playlists.add(playlist1);

                System.out.println("How many songs do you want to add to playlist?:");
                int songNumber = sc.nextInt();
                for (byte a = 0; a < songNumber; a++){

                    System.out.println("Enter artist name for Song " + (a+1) + ":");
                    String artist = sc.next();

                    System.out.println("Enter album name for Song " + (a+1) + ":");
                    String album = sc.next();

                    System.out.println("Enter song name for Song " + (a+1) + ":");
                    String name = sc.next();

                    System.out.println("Enter song duration in seconds for Song " + (a+1) + ":");
                    int duration1 = sc.nextInt();

                    System.out.println("Enter the times song has been played for Song " + (a+1) + ":");
                    int times = sc.nextInt();

                    Song aSong = new Song(name, artist, album, duration1, times);
                    playlist1.addSong(aSong);
                }
            }

            if (input.equals("2")){
                System.out.println(playlists.get(counter-1).toString());
            }

            if (input.equals("3")){
                playlists.get(counter-1).sortByDurationDesc();
                System.out.println(playlists.get(counter-1).toString());
            }

            if (input.equals("4")){
                System.out.println("Which song do you want to remove? (Remove by index)");
                byte index = sc.nextByte();

                playlists.get(counter-1).removeSong(index);
            }

            if (input.equals("5")){                 
                for( byte a = 0; a<playlists.size(); a++){
                    System.out.println(playlists.get(a).toString());
                }
            }
            System.out.println(intro + choice);
            String inputCont = sc.next();
            input = inputCont;
        }

    sc.close();
    }
}
