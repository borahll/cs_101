package lab10;

import java.util.Arrays;

public class Hackathon {
    private static byte MAX_NO_OF_PROJECTS = 6;
    private static byte INDICATOR_COUNT = 4;
    private static byte[] INDICATOR_WEIGHTS = {10,25,30,35};

    private int projectCount;
    private Project[] projects;

    public Hackathon(int aProjectCount, Project[] aProjects){
        projectCount = aProjectCount;
        projects = Arrays.copyOf(aProjects, aProjects.length);
    }

    public byte getMaxNoOfProjects(){return MAX_NO_OF_PROJECTS;}
    public byte getIndicatorCount(){return INDICATOR_COUNT;}
    public byte[] getIndicatorWeights(){return INDICATOR_WEIGHTS;}

    public void addProject(Project project){
        projects[projectCount++] = project;
        project.setHackathon(this);
    }
    public String toString(){
        String s1 = "";
        String s2 = "Initial Table\n***********************************************************************\nProject ID   Indicator 1   Indicator 2  Indicator 3  Indicator 4\n" ;
        String s3 = "Modified Table\n***********************************************************************\nProject ID   Indicator 1   Indicator 2  Indicator 3  Indicator 4\n" ;
        String s4 = "Final Table\n************************************************************************************************************************\nProject ID   Indicator 1   Indicator 2  Indicator 3  Indicator 4  Weighted Mean  Segment  Credibility\n" ;

        System.out.println(s2);
        for(byte a = 0; a < projectCount; a++){
            s1 +=  projects[a].toString(0);
        }
        System.out.println(s1);        
        s1 = "";

        System.out.println(s3);
        for(byte a = 0; a < projectCount; a++){
            s1 +=  projects[a].toString(1);
        }
        System.out.println(s1);        
        s1 = "";


        System.out.println(s4);
        for(byte a = 0; a < projectCount; a++){
            s1 +=  projects[a].toString(2);
        }
        return s1;
    }

    public static void main(String[] args) {
        double[] project1D = {100,240,15,26};
        Project project1 = new Project( "1", project1D);

        double[] project2D = {20,407,13,11};
        Project project2 = new Project("2", project2D);

        double[] project3D = {100,281,13,39};
        Project project3 = new Project("3", project3D);

        double[] project4D = {80,1264,4,38};
        Project project4 = new Project("4", project4D);

        double[] project5D = {20,1020,12,11};
        Project project5 = new Project("5", project5D);

        double[] project6D = {100,1162,17,34};
        Project project6 = new Project("6", project6D);

        Project[] projects = {project1, project2, project3, project4, project5,project6};
        Hackathon hackathon = new Hackathon(6, projects);

        System.out.println(hackathon.toString()); 
    }
}
