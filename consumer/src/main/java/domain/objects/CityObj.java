package domain.objects;

import javax.persistence.*;

/**
 * Created by Igor on 24.10.2015.
 */
@Entity
@Table(schema = "public",name = "City")
public class CityObj {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long city_id;
    private String city_name;
    @ManyToOne
    @JoinColumn(name="country_id",
            insertable=false, updatable=false,
            nullable=false)
    private CountryObj countryObj;


    public Long getCity_id() {
        return city_id;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }


    public CountryObj getCountryObj() {
        return countryObj;
    }

    public void setCountryObj(CountryObj countryObj) {
        this.countryObj = countryObj;
    }
}
