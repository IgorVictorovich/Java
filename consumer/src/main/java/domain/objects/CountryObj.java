package domain.objects;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Igor on 24.10.2015.
 */

@Entity
@Table(schema = "public",name = "Country")
public class CountryObj {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long country_id;
    private String country_name;
    private String country_ISO_Code;
    @OneToMany(cascade={CascadeType.ALL})
    @JoinColumn(name="country_id")
    //@IndexColumn(name="idx")
    private Set<CityObj> cityObj;


    public Long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Long country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_ISO_Code() {
        return country_ISO_Code;
    }

    public void setCountry_ISO_Code(String country_ISO_Code) {
        this.country_ISO_Code = country_ISO_Code;
    }


    public Set<CityObj> getCityObj(){
        return this.cityObj;
    }

    public void setCityObj(Set<CityObj> cityObj) {
        this.cityObj = cityObj;
    }
}
