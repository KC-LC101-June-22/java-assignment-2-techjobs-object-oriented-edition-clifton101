package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency){
        this();
        name = aName;
        employer = aEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }
    @Override
    public String toString() {

        String jobString = "";

        if (name == null || name.isEmpty()) {
            name = "Data not available.";
        }
        if (employer == null || employer.getValue() == "" ) {
            employer.setValue(name);
        }
        if (location.getValue().equals("") || location == null) {
            location.setValue(name);
        }
        if (positionType.getValue().equals("") || positionType  == null) {
            positionType.setValue(name);
        }
        if (coreCompetency.getValue().equals("") || coreCompetency  == null) {
            coreCompetency.setValue(name);
        }
        jobString = "\n" + "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Employer: " + employer + "\n" +
                "Location: " + location + "\n" +
                "PositionType: " + positionType + "\n" +
                "CoreCompetency: " + coreCompetency + "\n";
        return jobString;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Job job = (Job) object;
        return id == job.id;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }

    public String getName() {
        if (name == null || name.isEmpty()){
            return "Data not available.";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }



    //    @Override
//    public boolean equals(Object o){
//        if (this == o) return true;
//        if (!(o instanceof Job)) return false;
//        Job job = (Job) o;
//        return id == job.id;
//    }
//    @Override
//    public int hashCode() {return Objects.hash(id);}

}
