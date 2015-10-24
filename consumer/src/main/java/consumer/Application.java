package consumer;

/**
 * Created by Igor on 24.10.2015.
 */

import consumer.objects.City;
import consumer.objects.Country;
import consumer.objects.Request;
import consumer.objects.Response;
import domain.objects.CityObj;
import domain.objects.CountryObj;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        Request request = new Request();

        request.setKey("$1$12309856$euBrWcjT767K2sP9MHcVS/");
        request.setEcho("Test task for Tripcomposer by Igor");

        Response response = new QueryCountryList().queryList(request);

        /*Database*/
        // loads configuration and mappings
        Configuration configuration = new Configuration().configure();
        ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
        registry.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = registry.buildServiceRegistry();

        // builds a session factory from the service registry
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        // obtains the session
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        /*Store response to domain objects*/
        List<Country> countryList =  response.getCountries();
        for (int i=0; i<countryList.size(); i++){
            /*Country object*/

            CountryObj countryObj = new CountryObj();
            countryObj.setCountry_name(countryList.get(i).getCountryName());
            countryObj.setCountry_ISO_Code(countryList.get(i).getCountryISOCode());
            /*City object*/
            List <City> citiesList = countryList.get(i).getCities();
            Set<CityObj> cityObjSet = new HashSet<>();
            for(int j=0; j<citiesList.size();j++){
                CityObj cityObj = new CityObj();

                cityObj.setCity_name(citiesList.get(j).getCityName());
                cityObjSet.add(cityObj);

            }
            countryObj.setCityObj(cityObjSet);
            Long resultId = (Long)session.save(countryObj);
            System.out.println("Data persisted with id:"+resultId);
        }
        session.getTransaction().commit();
        session.close();
    }
}