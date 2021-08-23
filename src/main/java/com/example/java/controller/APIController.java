/*
 * 
 * 
 *
 * 
 * 
 *

 */

package com.example.java.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import com.example.java.service.APIService;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;


    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

@RestController
public class APIController {

    @Autowired
    public APIService service;

        @GetMapping("/helloWorld")
        public ResponseEntity<String> getResult(@RequestParam(value="first", required=true) Integer first, @RequestParam(value="second", required=true) Integer second) {
            String obj =  service.getResult(first, second);
             return new ResponseEntity(obj, HttpStatus.OK); 
        }



}