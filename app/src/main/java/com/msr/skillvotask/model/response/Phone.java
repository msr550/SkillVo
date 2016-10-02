
package com.msr.skillvotask.model.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Phone implements Serializable {

    @SerializedName("callingCode")
    private Integer callingCode;
    @SerializedName("isoCode")
    private String isoCode;
    @SerializedName("number")
    private String number;
    @SerializedName("extension")
    private String extension;
    @SerializedName("isPrimary")
    private Boolean isPrimary;
    @SerializedName("type")
    private String type;

    /**
     * @return The callingCode
     */
    public Integer getCallingCode() {
        return callingCode;
    }

    /**
     * @param callingCode The callingCode
     */
    public void setCallingCode(Integer callingCode) {
        this.callingCode = callingCode;
    }

    /**
     * @return The isoCode
     */
    public String getIsoCode() {
        return isoCode;
    }

    /**
     * @param isoCode The isoCode
     */
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    /**
     * @return The number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number The number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return The extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension The extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * @return The isPrimary
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * @param isPrimary The isPrimary
     */
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

}
