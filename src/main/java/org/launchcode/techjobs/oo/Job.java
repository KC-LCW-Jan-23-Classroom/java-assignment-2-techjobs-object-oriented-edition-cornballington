package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private int id;

    public int getId() {
        return id;
    }

    private static int nextId = 1;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Employer employer;

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private PositionType positionType;

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    private CoreCompetency coreCompetency;

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    @Override
    public String toString() {

        String name;
        if(this.name == "" || this.name == null) {
            name = "Data not available";
        } else {
            name = this.name;
        }
        String employer;
        if (this.employer.getValue() == "" || this.employer.getValue() == null) {
            employer = "Data not available";
        } else {
            employer = this.employer.getValue();
        }

        String location;
        if (this.location.getValue() == "" || this.location.getValue() == null) {
            location = "Data not available";
        } else  {
            location = this.location.getValue();
        }

        String positionType;
        if (this.positionType.getValue() == "" || this.positionType.getValue() == null) {
            positionType = "Data not available";
        } else {
            positionType = this.positionType.getValue();
        }

        String coreCompetency;
        if (this.coreCompetency.getValue() == "" || this.coreCompetency.getValue() == null) {
          coreCompetency = "Data not available";
        } else {
            coreCompetency = this.coreCompetency.getValue();
        }

return  '\n' +
        "ID: " + this.id + '\n' +

        "Name: " + name + '\n' +

        "Employer: " + employer + '\n' +

        "Location: " + location + '\n' +

        "Position Type: " + positionType + '\n' +

        "Core Competency: " + coreCompetency + '\n';

    }
}
