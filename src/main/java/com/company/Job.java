package com.company;

import java.util.Objects;

public class Job {
    private static int nextId = 1;

    private int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.

    public String getName() {
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

    @Override
    public String toString() {
        String newString;
        if (getName().equals("")) {
            this.name = "Data not available";
        }
        if (getEmployer().getValue().equals("")) {
            this.employer = new Employer("Data not available");
        }
        if (getLocation().getValue().equals("")) {
            this.location = new Location("Data not available");
        }
        if (getPositionType().getValue().equals("")) {
            this.positionType = new PositionType("Data not available");
        }
        if (getCoreCompetency().getValue().equals("")) {
            this.coreCompetency = new CoreCompetency("Data not available");
        }

        newString = "ID: " + this.getId() + "\nName: " + getName() + "\nEmployer: " + getEmployer() + "\nLocation: " + getLocation() + "\nPosition Type: " + getPositionType() + "\nCore Competency: " + getCoreCompetency() + "\n";

        return newString;
        // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.
    }
}