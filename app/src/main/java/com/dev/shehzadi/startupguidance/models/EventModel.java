package com.dev.shehzadi.startupguidance.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by shehzadi on 18/3/18.
 */

public class EventModel implements Reviewable {

    private String eventId;
    private String eventTitle;
    private String description;
    private String photoLocation;
    private String eventDate;
    private LocationModel location;
    private int maxRegistrationCount;
    private int totalRegistrationCount;
    private String registrationLastDate;
    private long registrationFee;
    private ArrayList<String> registeredMemberUid;
    private String eventOrganizerUid;

    private String feedbackType;

    public EventModel() {
        feedbackType = TYPE_EVENT;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoLocation() {
        return photoLocation;
    }

    public void setPhotoLocation(String photoLocation) {
        this.photoLocation = photoLocation;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }

    public int getMaxRegistrationCount() {
        return maxRegistrationCount;
    }

    public void setMaxRegistrationCount(int maxRegistrationCount) {
        this.maxRegistrationCount = maxRegistrationCount;
    }

    public int getTotalRegistrationCount() {
        return totalRegistrationCount;
    }

    public void setTotalRegistrationCount(int totalRegistrationCount) {
        this.totalRegistrationCount = totalRegistrationCount;
    }

    public String getRegistrationLastDate() {
        return registrationLastDate;
    }

    public void setRegistrationLastDate(String registrationLastDate) {
        this.registrationLastDate = registrationLastDate;
    }

    public long getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(long registrationFee) {
        this.registrationFee = registrationFee;
    }

    public ArrayList<String> getRegisteredMemberUid() {
        return registeredMemberUid;
    }

    public void setRegisteredMemberUid(ArrayList<String> registeredMemberUid) {
        this.registeredMemberUid = registeredMemberUid;
    }

    public String getEventOrganizerUid() {
        return eventOrganizerUid;
    }

    public void setEventOrganizerUid(String eventOrganizerUid) {
        this.eventOrganizerUid = eventOrganizerUid;
    }

    public String getFeedbackType() {
        return feedbackType;
    }
}
