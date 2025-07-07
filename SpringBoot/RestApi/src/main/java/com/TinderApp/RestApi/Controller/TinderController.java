package com.TinderApp.RestApi.Controller;

import com.TinderApp.RestApi.dto.Person;
import com.TinderApp.RestApi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@RestController
@RequestMapping("api")
public class TinderController {
    @Autowired
    PersonService personService;

    @GetMapping("/getPersons")
    List<Person> getAllInformation()
    {
        List<Person> details=personService.getAllData();
        List<Person>  filterInfo= personService.filterData(details);
        return filterInfo;

    }
//    @PostMapping("/create-user")
//    Person createUser(@RequestBody Person person )
//    {
//
//        return  person;
//    }





}
