
package com.msr.skillvotask.model.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RatingDetailsAverage implements Serializable {

    @SerializedName("criteria")
    private String criteria;
    @SerializedName("rating")
    private Integer rating;

    /**
     * @return The criteria
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * @param criteria The criteria
     */
    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    /**
     * @return The rating
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * @param rating The rating
     */
    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
