package consumer;

import consumer.objects.Request;
import consumer.objects.Response;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Igor on 24.10.2015.
 */
public class QueryCountryList {

    public Response queryList(Request request){
        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.postForObject("http://tripcomposer.net/rest/test/countries/get", request,Response.class);
        return response;
    }

}
