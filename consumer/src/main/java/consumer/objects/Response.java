package consumer.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Response {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("time")
    @Expose
    private Long time;
    @SerializedName("countries")
    @Expose
    private List<Country> countries = new ArrayList<Country>();
    @SerializedName("echo")
    @Expose
    private String echo;

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The time
     */
    public Long getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The countries
     */
    public List<Country> getCountries() {
        return countries;
    }

    /**
     * 
     * @param countries
     *     The countries
     */
    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    /**
     * 
     * @return
     *     The echo
     */
    public String getEcho() {
        return echo;
    }

    /**
     * 
     * @param echo
     *     The echo
     */
    public void setEcho(String echo) {
        this.echo = echo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(time).append(countries).append(echo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return new EqualsBuilder().append(type, rhs.type).append(time, rhs.time).append(countries, rhs.countries).append(echo, rhs.echo).isEquals();
    }

}
