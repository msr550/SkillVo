
package com.msr.skillvotask.model.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PagedList implements Serializable {

    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("services")
    private List<String> services = new ArrayList<String>();
    @SerializedName("status")
    private String status;
    @SerializedName("started")
    private String started;
    @SerializedName("completed")
    private Object completed;
    @SerializedName("consumer")
    private String consumer;
    @SerializedName("provider")
    private String provider;
    @SerializedName("shortProvider")
    private ShortProvider shortProvider;
    @SerializedName("isVerified")
    private Boolean isVerified;
    @SerializedName("verifiedDate")
    private String verifiedDate;
    @SerializedName("uniqueUrl")
    private String uniqueUrl;
    @SerializedName("portfolio")
    private List<Portfolio> portfolio = new ArrayList<Portfolio>();
    @SerializedName("sharingUrl")
    private String sharingUrl;
    @SerializedName("position")
    private Integer position;

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
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The started
     */
    public String getStarted() {
        return started;
    }

    /**
     * @param started The started
     */
    public void setStarted(String started) {
        this.started = started;
    }

    /**
     * @return The completed
     */
    public Object getCompleted() {
        return completed;
    }

    /**
     * @param completed The completed
     */
    public void setCompleted(Object completed) {
        this.completed = completed;
    }

    /**
     * @return The consumer
     */
    public String getConsumer() {
        return consumer;
    }

    /**
     * @param consumer The consumer
     */
    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    /**
     * @return The provider
     */
    public String getProvider() {
        return provider;
    }

    /**
     * @param provider The provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * @return The shortProvider
     */
    public ShortProvider getShortProvider() {
        return shortProvider;
    }

    /**
     * @param shortProvider The shortProvider
     */
    public void setShortProvider(ShortProvider shortProvider) {
        this.shortProvider = shortProvider;
    }

    /**
     * @return The isVerified
     */
    public Boolean getIsVerified() {
        return isVerified;
    }

    /**
     * @param isVerified The isVerified
     */
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    /**
     * @return The verifiedDate
     */
    public String getVerifiedDate() {
        return verifiedDate;
    }

    /**
     * @param verifiedDate The verifiedDate
     */
    public void setVerifiedDate(String verifiedDate) {
        this.verifiedDate = verifiedDate;
    }

    /**
     * @return The uniqueUrl
     */
    public String getUniqueUrl() {
        return uniqueUrl;
    }

    /**
     * @param uniqueUrl The uniqueUrl
     */
    public void setUniqueUrl(String uniqueUrl) {
        this.uniqueUrl = uniqueUrl;
    }

    /**
     * @return The portfolio
     */
    public List<Portfolio> getPortfolio() {
        return portfolio;
    }

    /**
     * @param portfolio The portfolio
     */
    public void setPortfolio(List<Portfolio> portfolio) {
        this.portfolio = portfolio;
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

}
