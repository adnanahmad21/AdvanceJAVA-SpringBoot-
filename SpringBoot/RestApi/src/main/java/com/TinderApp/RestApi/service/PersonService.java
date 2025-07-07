package com.TinderApp.RestApi.service;

import com.TinderApp.RestApi.dto.Person;
import java.util.List;
public interface PersonService {
    List<Person> getAllData();
    List<Person> filterData(List<Person> list);
}
