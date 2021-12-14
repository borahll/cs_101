package lab10;

import java.util.Arrays;

public class Project {
    private static byte INITIAL = 0;
    private static byte MODIFIED = 1;
    private static byte FINAL = 2;

    private String ID = "";
    private double finalScore = 0;
    private String segment = "?";
    private String credibility = "?";
    private double[] rawScores;
    private double[] modifiedScores;
    private Hackathon hackathon;

    public Project(String aID, double[] aRawArray){
        ID = aID;
        
        if(aRawArray.length <= 6){
            rawScores = aRawArray;
            modifiedScores = Arrays.copyOf(rawScores, rawScores.length);
        }
        else{
            System.out.println("enter a list shorter than 6 elements");
        }
    }

    public Hackathon getHackathon(){return hackathon;}

    public void setHackathon(Hackathon aHackathon){hackathon = aHackathon;}

    public void calcModifiedScores(){
        modifiedScores[0] = rawScores[0];

        if(rawScores[1]<=500 && rawScores[1]>0){modifiedScores[1] = 20;}
        else if(rawScores[1] <= 1000 && rawScores[1] > 500){modifiedScores[1] = 80;}
        else if(rawScores[1] > 1000){modifiedScores[1] = 100;}

        if(rawScores[2] <= 6 && rawScores[2]> 0){modifiedScores[2] = 100;}
        else if(rawScores[2] <=12 && rawScores[2] > 6){modifiedScores[2] = 80;}
        else if(rawScores[2] > 12){modifiedScores[2] = 20;}

        if(rawScores[3] >= 0 && rawScores[3] < 10){modifiedScores[3] = 20;}
        else if(rawScores[3] >= 10 && rawScores[3] < 10){modifiedScores[3] = 80;}
        else if(rawScores[3] >=15){modifiedScores[3] = 100;}
    }

    public void calcWeightAvg(){
        finalScore = (modifiedScores[0]/10 + modifiedScores[1]*(1/4) + modifiedScores[2] * (3/10) + modifiedScores[3] * (35/100))/100;
    }

    public void calcSegment(){
        if(finalScore > 0 && finalScore <= 40){segment = "D";}
        else if(finalScore <= 60){segment = "C";}
        else if(finalScore <= 75){segment = "B";}
        else if(finalScore <= 90){segment = "A";}
        else if(finalScore == 100){segment = "A+";}
        else{segment = "bruh";}
    }

    public void calcCredibility(){
        if(segment.equals("D")){credibility = "Not appropriate";}
        else if(segment.equals("C")){credibility = "Considerable";}
        else if(segment.equals("B")){credibility = "Good";}
        else if(segment.equals("A")){credibility = "Very Good";}
        else if(segment.equals("A+")){credibility = "Perfect";}
    }
    
}
