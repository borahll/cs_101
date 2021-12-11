package lab9;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private String name = "";
    private String creator = "";
    private String genre = "";
    private ArrayList<Song> songs = new ArrayList<>();

    public Playlist(){}
    public Playlist(String aName, String aCreator, String aGenre, Song aSong){
        name = aName;
        creator = aCreator;
        genre = aCreator;
        songs.add(aSong);
    }

    public String getName(){return name;}
    public String getCreator(){return creator;}
    public String getGenre(){return genre;}
    public void getSongs(){System.out.println(songs);}
    
    public void setName(String aName){name = aName;}
    public void setCreator(String aCreator){creator = aCreator;}
    public void setGenre(String aGenre){genre = aGenre;}
    public void setSong(Song song){
        songs.clear();
        songs.add(song);
    }

    public boolean songExists(Song aSong){
        if (songs.contains(aSong)){return true;}
        return false;
    }
    public void addSong(Song aSong){
        songs.add(aSong);
    }
    public void removeSong(int index){
        songs.remove(index);
    }
    public void sortByDurationDesc(){
        Collections.sort(songs);
    }
    public String toString(){
        String s2 = "";
        for(byte a = 0;a<songs.size(); a++){
            s2 = "\n--------------------------------------------------------" + "\nSong Name" + songs.get(a).getTitle() + "\nArtist NAme:" + songs.get(a).getArtist() + "\nAlbum name:" + songs.get(a).getAlbum() + "\nDuration:" + songs.get(a).getDuration() + "\nTimes Played:" + songs.get(a).getTimesPlayed() + "\n--------------------------------------------------------";
        }
        String s1 = "************************************************* \n --------------------------------------------------------\n Playlist Name:" + getName() + "\n Creator Name:" + getCreator() + "\n Genre:" + getGenre() + s2;
        return s1;
    }
    
}
