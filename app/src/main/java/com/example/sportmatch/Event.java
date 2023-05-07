package com.example.sportmatch;

public class Event {

    private String eventName;
    private String sport;
    private String nrPlayers;
    private String location;
    private String date;
    private String time;
    private String description;
    //private User user;
    

    public Event (){

    }

    public Event(String eventName, String sport, String nrPlayers, String location, String date, String time, String description) {
        this.eventName = eventName;
        this.sport = sport;
        this.nrPlayers = nrPlayers;
        this.location = location;
        this.date = date;
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getNrPlayers() {
        return nrPlayers;
    }

    public void setNrPlayers(String nrPlayers) {
        this.nrPlayers = nrPlayers;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}