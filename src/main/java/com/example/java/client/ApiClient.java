/*
 * 
 * 
 *
 * 
 * 
 *

 */

package com.example.java.client;


import org.springframework.stereotype.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

@Component
public class ApiClient {

    private RestTemplate restTemplate;

    public ApiClient(){
        this.restTemplate = new RestTemplate();
    }

        //public  String getResult(Integer first, Integer second, String methodType) {
        public  String getResult(Map queryParams, Map pathParams, String methodType) {
            String url = "https://spring-boot-k8s.herokuapp.com/mul?first={first}&second={second}";
            HttpHeaders httpHeaders = new HttpHeaders();
            HttpEntity httpEntity  = new HttpEntity<>(httpHeaders);

            switch(methodType) {
                case "GET":
                    return (String)restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class, queryParams).getBody();
                case "POST":
                    break;
                default:
                    break;
            }
            return null;
        }
}
