
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
public class Country {

    @SerializedName("countryName")
    @Expose
    private String countryName;
    @SerializedName("countryISOCode")
    @Expose
    private String countryISOCode;
    @SerializedName("cities")
    @Expose
    private List<City> cities = new ArrayList<City>();

    /**
     * 
     * @return
     *     The countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName
     *     The countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 
     * @return
     *     The countryISOCode
     */
    public String getCountryISOCode() {
        return countryISOCode;
    }

    /**
     * 
     * @param countryISOCode
     *     The countryISOCode
     */
    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    /**
     * 
     * @return
     *     The cities
     */
    public List<City> getCities() {
        return cities;
    }

    /**
     * 
     * @param cities
     *     The cities
     */
    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(countryName).append(countryISOCode).append(cities).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Country) == false) {
            return false;
        }
        Country rhs = ((Country) other);
        return new EqualsBuilder().append(countryName, rhs.countryName).append(countryISOCode, rhs.countryISOCode).append(cities, rhs.cities).isEquals();
    }

}
