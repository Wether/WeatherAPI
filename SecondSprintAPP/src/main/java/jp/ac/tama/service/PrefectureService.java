package jp.ac.tama.service;

import jp.ac.tama.model.Position;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by owner on 2016/08/05.
 */
@Service
public class PrefectureService {
    public Position getPosition(String Position) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Position> weatherResponseEntity = restTemplate.getForEntity("https://fast-reef-14433.herokuapp.com/prefectures", Position.class);
        return weatherResponseEntity.getBody();
    }
}