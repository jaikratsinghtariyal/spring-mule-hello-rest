/*
 * 
 * 
 *
 * 
 * 
 *

 */

package com.example.java.service;



import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
    import org.springframework.web.bind.annotation.*;
    import com.example.java.client.ApiClient;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;


@Service
public class APIService {

    @Autowired
    public ApiClient client;

        public  String getResult(Integer first, Integer second) {
            Map queryParams = prepareQueryParamMap(first, second);
            Map pathParams = preparePathParamMap();
            //return client.getResult(first, second, "GET");
            return client.getResult(queryParams, pathParams, "GET");
        }

    private Map prepareQueryParamMap(Integer first, Integer second) {
        Map<String, Object> map = new HashMap<>();
                map.put("first", first);
                map.put("second", second);

        return map;
    }

    private Map preparePathParamMap() {
        Map<String, String> map = new HashMap<>();

        return map;
    }


}