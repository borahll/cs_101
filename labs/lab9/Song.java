package lab9;

public class Song implements Comparable<Song>{

    private String title = "";
    private String artist = "";
    private String album = "";
    private int duration = 0;
    private int timesPlayed = 0;

    public Song(String a, String b, String c, int d, int e){
        title = a;
        artist = b;
        album = c;
        duration = d;
        timesPlayed = e;
    }

    public String getTitle(){return title;}
    public String getArtist(){return artist;}
    public String getAlbum(){return album;}
    public int getDuration(){return duration;}
    public int getTimesPlayed(){return timesPlayed;}

    public void setTite(String t){title = t;}
    public void setArtist(String a){artist = a;}
    public void setAlbum(String a){album = a;}
    public void setDuration(int d){duration = d;}
    public void setTimesPlayed(int t){timesPlayed = t;}

    public int compareTo(Song aSong){
        if (this.getDuration() > aSong.getDuration()){return 1;}
        else if (this.getDuration() == aSong.getDuration()){return 0;}
        else{return -1;}
    }

    public String toString(){
        String s1 = "************************************************* \n Song name:" + getTitle() + "\n Artist name" + getArtist() + "\n Album name :" + getAlbum() + "\n Duration:" + getDuration() + "\n Times played" + getTimesPlayed();
        return s1;
    }
}
