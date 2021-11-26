package lab7;

public class Player {

    private static short count = 0;
    private static int allCount  = 0;

    private int id = 0;
    private String name;
    private String position;
    private String team;
    private int rosterNumber;
    private boolean isActive = true;

    private int gamesPlayed = 1;
    private double pointsPerGame = 0;
    private double assistsPerGame = 0;
    private double reboundsPerGame = 0;
    private double turnOversPerGame = 0;
    private double efficiency; 


    public Player(String n, String p, String t, int r){
        name = n;
        position = p;
        team = t;
        rosterNumber = r;
        count++;
        allCount++;
        id = allCount;
    }

    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public String getTeam(){
        return team;
    }
    public int getId(){
        return id;
    }
    public boolean getIsActiveStatus(){
        return isActive;
    }
    public int getRosterNumber(){
        return rosterNumber;
    }
    public int getCount(){
        return count;
    }
    public double getEfficiency(){
        return efficiency;
    }
    public void setName(String n){
        name = n;
    }
    public void setPosition(String p){
        if(p.equals("SF")){
            position = p;
        }
        else if(p.equals("PF")){
            position = p;
        }
        else if(p.equals("SG")){
            position = p;
        }
        else if(p.equals("PG")){
            position = p;
        }
        else if(p.equals("C")){
            position = p;
        }
        else{
            System.out.println("you didnt enter a valid position (please enter the abbreviation of the position)");
        }
    }
    public void setTeam(String t){
        team = t;
    }
    public void setRosterNumber(int r){
        rosterNumber = r;
    }
    public void retire(){
        count--;
        isActive = false;
    }
    public void transfer(String t){
        if (team.equals(t)){System.out.println("the team u entered is the current team");}
        else{
            team = t;
        }
    }
    public boolean isBeforeThan(Player n){
        if (name.compareTo(n.name) > 0) { return true;}
        else {return false;}
    }


    public void recordGame(int p, int a, int r, int t){
        pointsPerGame = ((pointsPerGame*(gamesPlayed-1)) + p) / gamesPlayed;
        assistsPerGame = ((assistsPerGame*(gamesPlayed-1)) + a) / gamesPlayed;
        reboundsPerGame = ((reboundsPerGame*(gamesPlayed-1)) + r) / gamesPlayed;
        turnOversPerGame = ((turnOversPerGame*(gamesPlayed-1)) + t) / gamesPlayed;
        efficiency = pointsPerGame + 0.7 * assistsPerGame + 0.7 * reboundsPerGame - 0.9 * turnOversPerGame;
        gamesPlayed++;
    }

     
    public String toString(){

        if (isActive == true)
        {
            System.out.println("Retirement Status : Active among " + count + " active player(s)");
            System.out.println("***********************");
        }
        else 
        {
            System.out.println("Retirement Status : Retired among ");
            System.out.println("***********************");
        }

        return ("****************************** \n"+ "player Id : "+ id 
        + "\n Player name:" + name 
        + "\n player position" + position
        + "\n Current team : " + team
        + "\n Jersey Number :" + rosterNumber
        + "\n ---------------------------------------------"
        + "\n Stats"
        + "\n PPG:" + pointsPerGame
        + "\n APG:" + assistsPerGame
        + "\n RPG:" + reboundsPerGame
        + "\n TPG:" + turnOversPerGame
        + "\n Efficiency " + efficiency
        + "\n ----------------------------------------");
    }

    public boolean isMoreEfficient(Player p){
        if (this.efficiency > p.efficiency){return true;}
        else {return false;}
    }
}
