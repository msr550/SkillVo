
package com.msr.skillvotask.model.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Serializable {

    @SerializedName("position")
    private Integer position;
    @SerializedName("isPortfolioCover")
    private Boolean isPortfolioCover;
    @SerializedName("verifierInfo")
    private VerifierInfo verifierInfo;
    @SerializedName("verifierShortProfile")
    private Object verifierShortProfile;
    @SerializedName("verificationFirstRequestDate")
    private String verificationFirstRequestDate;
    @SerializedName("verificationRequestDate")
    private String verificationRequestDate;
    @SerializedName("verificationStatusDate")
    private String verificationStatusDate;
    @SerializedName("verificationStatus")
    private Integer verificationStatus;
    @SerializedName("verificationMessage")
    private Object verificationMessage;
    @SerializedName("isEmail")
    private Boolean isEmail;
    @SerializedName("canVerifierChange")
    private Boolean canVerifierChange;
    @SerializedName("remainingWaitHours")
    private Integer remainingWaitHours;
    @SerializedName("remainingWaitDays")
    private Integer remainingWaitDays;
    @SerializedName("completed")
    private String completed;
    @SerializedName("isLiked")
    private Boolean isLiked;
    @SerializedName("mediaType")
    private String mediaType;
    @SerializedName("id")
    private String id;
    @SerializedName("ownerId")
    private String ownerId;
    @SerializedName("owner")
    private Owner owner;
    @SerializedName("project")
    private Project project;
    @SerializedName("projectId")
    private String projectId;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("timeStamp")
    private String timeStamp;
    @SerializedName("url")
    private String url;
    @SerializedName("tags")
    private Object tags;
    @SerializedName("size")
    private Integer size;
    @SerializedName("likesCount")
    private Integer likesCount;
    @SerializedName("likes")
    private Object likes;
    @SerializedName("viewsCount")
    private Integer viewsCount;
    @SerializedName("services")
    private List<String> services = new ArrayList<String>();
    @SerializedName("issues")
    private Object issues;
    @SerializedName("sharingUrl")
    private String sharingUrl;
    @SerializedName("commentsCount")
    private Integer commentsCount;
    private int degrees = 0;            //used for internal logic

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    /**
     * @return The position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * @param position The position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * @return The isPortfolioCover
     */
    public Boolean getIsPortfolioCover() {
        return isPortfolioCover;
    }

    /**
     * @param isPortfolioCover The isPortfolioCover
     */
    public void setIsPortfolioCover(Boolean isPortfolioCover) {
        this.isPortfolioCover = isPortfolioCover;
    }

    /**
     * @return The verifierInfo
     */
    public VerifierInfo getVerifierInfo() {
        return verifierInfo;
    }

    /**
     * @param verifierInfo The verifierInfo
     */
    public void setVerifierInfo(VerifierInfo verifierInfo) {
        this.verifierInfo = verifierInfo;
    }

    /**
     * @return The verifierShortProfile
     */
    public Object getVerifierShortProfile() {
        return verifierShortProfile;
    }

    /**
     * @param verifierShortProfile The verifierShortProfile
     */
    public void setVerifierShortProfile(Object verifierShortProfile) {
        this.verifierShortProfile = verifierShortProfile;
    }

    /**
     * @return The verificationFirstRequestDate
     */
    public String getVerificationFirstRequestDate() {
        return verificationFirstRequestDate;
    }

    /**
     * @param verificationFirstRequestDate The verificationFirstRequestDate
     */
    public void setVerificationFirstRequestDate(String verificationFirstRequestDate) {
        this.verificationFirstRequestDate = verificationFirstRequestDate;
    }

    /**
     * @return The verificationRequestDate
     */
    public String getVerificationRequestDate() {
        return verificationRequestDate;
    }

    /**
     * @param verificationRequestDate The verificationRequestDate
     */
    public void setVerificationRequestDate(String verificationRequestDate) {
        this.verificationRequestDate = verificationRequestDate;
    }

    /**
     * @return The verificationStatusDate
     */
    public String getVerificationStatusDate() {
        return verificationStatusDate;
    }

    /**
     * @param verificationStatusDate The verificationStatusDate
     */
    public void setVerificationStatusDate(String verificationStatusDate) {
        this.verificationStatusDate = verificationStatusDate;
    }

    /**
     * @return The verificationStatus
     */
    public Integer getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * @param verificationStatus The verificationStatus
     */
    public void setVerificationStatus(Integer verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    /**
     * @return The verificationMessage
     */
    public Object getVerificationMessage() {
        return verificationMessage;
    }

    /**
     * @param verificationMessage The verificationMessage
     */
    public void setVerificationMessage(Object verificationMessage) {
        this.verificationMessage = verificationMessage;
    }

    /**
     * @return The isEmail
     */
    public Boolean getIsEmail() {
        return isEmail;
    }

    /**
     * @param isEmail The isEmail
     */
    public void setIsEmail(Boolean isEmail) {
        this.isEmail = isEmail;
    }

    /**
     * @return The canVerifierChange
     */
    public Boolean getCanVerifierChange() {
        return canVerifierChange;
    }

    /**
     * @param canVerifierChange The canVerifierChange
     */
    public void setCanVerifierChange(Boolean canVerifierChange) {
        this.canVerifierChange = canVerifierChange;
    }

    /**
     * @return The remainingWaitHours
     */
    public Integer getRemainingWaitHours() {
        return remainingWaitHours;
    }

    /**
     * @param remainingWaitHours The remainingWaitHours
     */
    public void setRemainingWaitHours(Integer remainingWaitHours) {
        this.remainingWaitHours = remainingWaitHours;
    }

    /**
     * @return The remainingWaitDays
     */
    public Integer getRemainingWaitDays() {
        return remainingWaitDays;
    }

    /**
     * @param remainingWaitDays The remainingWaitDays
     */
    public void setRemainingWaitDays(Integer remainingWaitDays) {
        this.remainingWaitDays = remainingWaitDays;
    }

    /**
     * @return The completed
     */
    public String getCompleted() {
        return completed;
    }

    /**
     * @param completed The completed
     */
    public void setCompleted(String completed) {
        this.completed = completed;
    }

    /**
     * @return The isLiked
     */
    public Boolean getIsLiked() {
        return isLiked;
    }

    /**
     * @param isLiked The isLiked
     */
    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    /**
     * @return The mediaType
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * @param mediaType The mediaType
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId The ownerId
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * @return The owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * @param owner The owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * @return The project
     */
    public Project getProject() {
        return project;
    }

    /**
     * @param project The project
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * @return The projectId
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId The projectId
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The timeStamp
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp The timeStamp
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The tags
     */
    public Object getTags() {
        return tags;
    }

    /**
     * @param tags The tags
     */
    public void setTags(Object tags) {
        this.tags = tags;
    }

    /**
     * @return The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @param size The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * @return The likesCount
     */
    public Integer getLikesCount() {
        return likesCount;
    }

    /**
     * @param likesCount The likesCount
     */
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    /**
     * @return The likes
     */
    public Object getLikes() {
        return likes;
    }

    /**
     * @param likes The likes
     */
    public void setLikes(Object likes) {
        this.likes = likes;
    }

    /**
     * @return The viewsCount
     */
    public Integer getViewsCount() {
        return viewsCount;
    }

    /**
     * @param viewsCount The viewsCount
     */
    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }

    /**
     * @return The services
     */
    public List<String> getServices() {
        return services;
    }

    /**
     * @param services The services
     */
    public void setServices(List<String> services) {
        this.services = services;
    }

    /**
     * @return The issues
     */
    public Object getIssues() {
        return issues;
    }

    /**
     * @param issues The issues
     */
    public void setIssues(Object issues) {
        this.issues = issues;
    }

    /**
     * @return The sharingUrl
     */
    public String getSharingUrl() {
        return sharingUrl;
    }

    /**
     * @param sharingUrl The sharingUrl
     */
    public void setSharingUrl(String sharingUrl) {
        this.sharingUrl = sharingUrl;
    }

    /**
     * @return The commentsCount
     */
    public Integer getCommentsCount() {
        return commentsCount;
    }

    /**
     * @param commentsCount The commentsCount
     */
    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

}
