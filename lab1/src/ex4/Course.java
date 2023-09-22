package ex4;

import java.util.Vector;

public class Course {
    private String name;
    private String description;
    private int numberOfCredits;
    private Vector<String> prerequisites;
    {
    	prerequisites = new Vector<String>();

    }
    public Course() {
    	
    }
    public Course(String name, String description, int numberOfCredits, String prerequisite) {
    	this.name = name;
    	this.description = description;
    	this.numberOfCredits = numberOfCredits;
    	prerequisites.add(prerequisite);
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public String getPrerequisites() {
        StringBuilder sb = new StringBuilder();
        for (String prerequisite : prerequisites) {
            sb.append(prerequisite).append(", ");
        }

        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites.add(prerequisites);
    }
    public String toString() {
    	
        return name + " " + description + " " + numberOfCredits + " " + getPrerequisites();
    }
}
