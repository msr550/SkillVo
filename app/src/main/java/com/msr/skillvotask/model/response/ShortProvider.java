
package com.msr.skillvotask.model.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShortProvider implements Serializable {

    @SerializedName("id")
    private String id;
    @SerializedName("userId")
    private Integer userId;
    @SerializedName("uniqueUrl")
    private String uniqueUrl;
    @SerializedName("emailAddress")
    private String emailAddress;
    @SerializedName("pictureUrl")
    private String pictureUrl;
    @SerializedName("isProvider")
    private Boolean isProvider;
    @SerializedName("firstName")
    private String firstName;
    @SerializedName("lastName")
    private String lastName;
    @SerializedName("businessName")
    private String businessName;
    @SerializedName("useBusinessNameForProfile")
    private Boolean useBusinessNameForProfile;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("totalReviews")
    private Integer totalReviews;
    @SerializedName("totalReviewsWritten")
    private Integer totalReviewsWritten;
    @SerializedName("totalVerifications")
    private Integer totalVerifications;
    @SerializedName("keyword")
    private Object keyword;
    @SerializedName("description")
    private String description;
    @SerializedName("totalFollowers")
    private Integer totalFollowers;
    @SerializedName("totalFollowing")
    private Integer totalFollowing;
    @SerializedName("isFollowing")
    private Boolean isFollowing;
    @SerializedName("phones")
    private List<Phone> phones = new ArrayList<Phone>();
    @SerializedName("ratingDetailsAverage")
    private List<RatingDetailsAverage> ratingDetailsAverage = new ArrayList<RatingDetailsAverage>();
    @SerializedName("sharingUrl")
    private String sharingUrl;
    @SerializedName("aliasUrl")
    private String aliasUrl;
    @SerializedName("portfolioSharingUrl")
    private String portfolioSharingUrl;

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
     * @return The userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId The userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * @return The emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress The emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return The pictureUrl
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * @param pictureUrl The pictureUrl
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    /**
     * @return The isProvider
     */
    public Boolean getIsProvider() {
        return isProvider;
    }

    /**
     * @param isProvider The isProvider
     */
    public void setIsProvider(Boolean isProvider) {
        this.isProvider = isProvider;
    }

    /**
     * @return The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName The firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName The lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return The businessName
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * @param businessName The businessName
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * @return The useBusinessNameForProfile
     */
    public Boolean getUseBusinessNameForProfile() {
        return useBusinessNameForProfile;
    }

    /**
     * @param useBusinessNameForProfile The useBusinessNameForProfile
     */
    public void setUseBusinessNameForProfile(Boolean useBusinessNameForProfile) {
        this.useBusinessNameForProfile = useBusinessNameForProfile;
    }

    /**
     * @return The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName The displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return The totalReviews
     */
    public Integer getTotalReviews() {
        return totalReviews;
    }

    /**
     * @param totalReviews The totalReviews
     */
    public void setTotalReviews(Integer totalReviews) {
        this.totalReviews = totalReviews;
    }

    /**
     * @return The totalReviewsWritten
     */
    public Integer getTotalReviewsWritten() {
        return totalReviewsWritten;
    }

    /**
     * @param totalReviewsWritten The totalReviewsWritten
     */
    public void setTotalReviewsWritten(Integer totalReviewsWritten) {
        this.totalReviewsWritten = totalReviewsWritten;
    }

    /**
     * @return The totalVerifications
     */
    public Integer getTotalVerifications() {
        return totalVerifications;
    }

    /**
     * @param totalVerifications The totalVerifications
     */
    public void setTotalVerifications(Integer totalVerifications) {
        this.totalVerifications = totalVerifications;
    }

    /**
     * @return The keyword
     */
    public Object getKeyword() {
        return keyword;
    }

    /**
     * @param keyword The keyword
     */
    public void setKeyword(Object keyword) {
        this.keyword = keyword;
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
     * @return The totalFollowers
     */
    public Integer getTotalFollowers() {
        return totalFollowers;
    }

    /**
     * @param totalFollowers The totalFollowers
     */
    public void setTotalFollowers(Integer totalFollowers) {
        this.totalFollowers = totalFollowers;
    }

    /**
     * @return The totalFollowing
     */
    public Integer getTotalFollowing() {
        return totalFollowing;
    }

    /**
     * @param totalFollowing The totalFollowing
     */
    public void setTotalFollowing(Integer totalFollowing) {
        this.totalFollowing = totalFollowing;
    }

    /**
     * @return The isFollowing
     */
    public Boolean getIsFollowing() {
        return isFollowing;
    }

    /**
     * @param isFollowing The isFollowing
     */
    public void setIsFollowing(Boolean isFollowing) {
        this.isFollowing = isFollowing;
    }

    /**
     * @return The phones
     */
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * @param phones The phones
     */
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    /**
     * @return The ratingDetailsAverage
     */
    public List<RatingDetailsAverage> getRatingDetailsAverage() {
        return ratingDetailsAverage;
    }

    /**
     * @param ratingDetailsAverage The ratingDetailsAverage
     */
    public void setRatingDetailsAverage(List<RatingDetailsAverage> ratingDetailsAverage) {
        this.ratingDetailsAverage = ratingDetailsAverage;
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
     * @return The aliasUrl
     */
    public String getAliasUrl() {
        return aliasUrl;
    }

    /**
     * @param aliasUrl The aliasUrl
     */
    public void setAliasUrl(String aliasUrl) {
        this.aliasUrl = aliasUrl;
    }

    /**
     * @return The portfolioSharingUrl
     */
    public String getPortfolioSharingUrl() {
        return portfolioSharingUrl;
    }

    /**
     * @param portfolioSharingUrl The portfolioSharingUrl
     */
    public void setPortfolioSharingUrl(String portfolioSharingUrl) {
        this.portfolioSharingUrl = portfolioSharingUrl;
    }

}
