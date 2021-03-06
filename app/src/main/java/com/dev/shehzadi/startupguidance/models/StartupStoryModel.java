package com.dev.shehzadi.startupguidance.models;

import java.io.Serializable;

/**
 * Created by shehzadi on 18/3/18.
 */

public class StartupStoryModel implements Serializable, Reviewable {

    private String storyId;
    private String storyTitle;
    private String description;
    private String authorName;
    private String story;
    private String photoLocation;
    private String postedOn;
    private String postedByUid;

    private String feedbackType;

    public StartupStoryModel() {
        feedbackType = TYPE_STARTUP_STORY;
    }

    public String getStoryId() {
        return storyId;
    }

    public void setStoryId(String storyId) {
        this.storyId = storyId;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getPhotoLocation() {
        return photoLocation;
    }

    public void setPhotoLocation(String photoLocation) {
        this.photoLocation = photoLocation;
    }

    public String getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(String postedOn) {
        this.postedOn = postedOn;
    }

    public String getPostedByUid() {
        return postedByUid;
    }

    public void setPostedByUid(String postedByUid) {
        this.postedByUid = postedByUid;
    }

    public String getFeedbackType() {
        return feedbackType;
    }
}
