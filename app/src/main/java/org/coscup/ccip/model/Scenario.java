
package org.coscup.ccip.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Scenario {

    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("available_time")
    @Expose
    private Integer availableTime;
    @SerializedName("attr")
    @Expose
    private Attr attr;
    @SerializedName("expire_time")
    @Expose
    private Integer expireTime;
    @SerializedName("used")
    @Expose
    private Integer used;

    /**
     * 
     * @return
     *     The order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The availableTime
     */
    public Integer getAvailableTime() {
        return availableTime;
    }

    /**
     * 
     * @param availableTime
     *     The available_time
     */
    public void setAvailableTime(Integer availableTime) {
        this.availableTime = availableTime;
    }

    /**
     * 
     * @return
     *     The attr
     */
    public Attr getAttr() {
        return attr;
    }

    /**
     * 
     * @param attr
     *     The attr
     */
    public void setAttr(Attr attr) {
        this.attr = attr;
    }

    /**
     * 
     * @return
     *     The expireTime
     */
    public Integer getExpireTime() {
        return expireTime;
    }

    /**
     * 
     * @param expireTime
     *     The expire_time
     */
    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 
     * @return
     *     The used
     */
    public Integer getUsed() {
        return used;
    }

    /**
     * 
     * @param used
     *     The used
     */
    public void setUsed(Integer used) {
        this.used = used;
    }

}