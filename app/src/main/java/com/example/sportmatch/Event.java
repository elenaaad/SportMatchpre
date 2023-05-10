package com.example.sportmatch;

import java.util.List;

public class Event {
    private String key;
    private String eventName;
    private String sport;
    private String nrPlayers;
    private String location;
    private String date;
    private String time;
    private String description;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    private String creator;
    private List<String> participants; // list of user IDs who have registered for this event
    private String chatId;

    public Event (){

    }
    String getChatId() {
        return chatId;
    }
    public Event(String eventName, String sport, String nrPlayers, String location, String date, String time, String description, String creator, List<String> participants, String chatId) {
        this.key = null;
        this.eventName = eventName;
        this.sport = sport;
        this.nrPlayers = nrPlayers;
        this.location = location;
        this.date = date;
        this.time = time;
        this.description = description;
        this.creator = creator;
        this.participants = participants;
        this.chatId = chatId;
       // Add the event creator to the registered players list
    }

    public String getUid() {
        return key;
    }

    public void setUid(String uid) {
        this.key = uid;
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

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}
