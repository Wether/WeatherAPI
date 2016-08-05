package jp.ac.tama.controller;

import jp.ac.tama.model.Weather;
import jp.ac.tama.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kajiwarayutaka on 2016/08/05.
 */
@RestController
@RequestMapping(value = "weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @RequestMapping(value = "" ,method = RequestMethod.GET)
    public Weather showWeather(@RequestParam("token") String token){
        return weatherService.getWeather();
    }
}