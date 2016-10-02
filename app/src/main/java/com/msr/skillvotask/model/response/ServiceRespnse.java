
package com.msr.skillvotask.model.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ServiceRespnse implements Serializable {

    @SerializedName("pagedList")
    private List<PagedList> pagedList = new ArrayList<PagedList>();
    @SerializedName("totalResults")
    private Integer totalResults;

    /**
     * @return The pagedList
     */
    public List<PagedList> getPagedList() {
        return pagedList;
    }

    /**
     * @param pagedList The pagedList
     */
    public void setPagedList(List<PagedList> pagedList) {
        this.pagedList = pagedList;
    }

    /**
     * @return The totalResults
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * @param totalResults The totalResults
     */
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

}
