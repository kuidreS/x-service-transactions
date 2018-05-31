package vitalii.serdiuk.test.client.http;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import vitalii.serdiuk.test.model.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class UserHttpClient {

    public List<User> getAllUsers(String url) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<User>> userResponse = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {});
        return userResponse.getBody();
    }

}
