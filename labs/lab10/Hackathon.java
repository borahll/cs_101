package lab10;

public class Hackathon {
    private static byte MAX_NO_OF_PROJECTS = 6;
    private static byte INDICATOR_COUNT = 4;
    private static byte[] INDICATOR_WEIGHTS = {10,25,30,35};

    private byte projectCount;
    private Project[] projects;

    public Hackathon(byte aProjectCount, Project[] aProjects){
        projectCount = aProjectCount;
        projects = aProjects;
    }

    public byte getMaxNoOfProjects(){return MAX_NO_OF_PROJECTS;}
    public byte getIndicatorCount(){return INDICATOR_COUNT;}
    public byte[] getIndicatorWeights(){return INDICATOR_WEIGHTS;}

    public void addProject(Project project){
        projects[projectCount++] = project;
        project.setHackathon(this);
    }
    public String toString(){
        String s1 = "";  //!*!*!*!*!*!*
        return s1;
    }
}
