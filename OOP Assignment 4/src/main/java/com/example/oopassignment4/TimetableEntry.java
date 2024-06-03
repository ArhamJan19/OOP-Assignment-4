package com.example.oopassignment4;

public class TimetableEntry {
    private String day;
    private String time;
    private String course;
    private String section;
    private String room;
    private String instructor;

    public TimetableEntry(String day, String time, String course, String section, String room, String instructor) {
        this.day = day;
        this.time = time;
        this.course = course;
        this.section = section;
        this.room = room;
        this.instructor = instructor;
    }

    // Getters and setters

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return day + ", " + time + ", " + course + ", " + section + ", " + room + ", " + instructor;
    }
}
