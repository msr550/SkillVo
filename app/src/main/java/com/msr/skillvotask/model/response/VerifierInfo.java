
package com.msr.skillvotask.model.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class VerifierInfo implements Serializable {

    @SerializedName("userId")
    private String userId;
    @SerializedName("firstName")
    private Object firstName;
    @SerializedName("lastName")
    private Object lastName;
    @SerializedName("email")
    private Object email;

    /**
     * @return The userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId The userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return The firstName
     */
    public Object getFirstName() {
        return firstName;
    }

    /**
     * @param firstName The firstName
     */
    public void setFirstName(Object firstName) {
        this.firstName = firstName;
    }

    /**
     * @return The lastName
     */
    public Object getLastName() {
        return lastName;
    }

    /**
     * @param lastName The lastName
     */
    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    /**
     * @return The email
     */
    public Object getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(Object email) {
        this.email = email;
    }

}
