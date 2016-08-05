package jp.ac.tama.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jp.ac.tama.model.Weather;

/**
 * Created by kajiwarayutaka on 2016/08/05.
 */
@Service
public class WeatherService {
    public Weather getWeather(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Weather> weatherResponseEntity = restTemplate.getForEntity("http://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=(\n" +
                "Key\tName\t\n" +
                "5aef7490fb2f5dd1a5815969f928ef5c)",Weather.class);
        return weatherResponseEntity.getBody();
    }
}