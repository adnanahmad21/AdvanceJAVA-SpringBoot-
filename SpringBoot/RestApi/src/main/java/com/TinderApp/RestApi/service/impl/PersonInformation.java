package com.TinderApp.RestApi.service.impl;

import com.TinderApp.RestApi.dto.Person;
import com.TinderApp.RestApi.service.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonInformation implements PersonService {
    @Value("${user.gender}")
    String userGender;
    Person person1=new Person("Adnan",23,"Prayagraj","Male","BTECH");
    Person person2=new Person("Saboor",24,"Prayagraj","Male","BTECH");
    Person person3=new Person("Iqra",20,"Prayagraj","Female","BTECH");
    List<Person> personDetail =new ArrayList<>();
    @Override
    public List<Person> getAllData() {
        personDetail.add(person1);
        personDetail.add(person2);
        personDetail.add(person3);
        return personDetail;
    }

    @Override
    public List<Person> filterData(List<Person> list) {
        List<Person> filter=new ArrayList<>();
        for(Person p: list)
        {
            if(!userGender.equalsIgnoreCase(p.getGender()))
            {
                filter.add(p);
            }
        }
        return  filter;
    }
}
