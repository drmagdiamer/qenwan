package com.medinaqenwan.qenwanPhase1.service.implementation;

import com.medinaqenwan.qenwanPhase1.model.pojo.Person;
import com.medinaqenwan.qenwanPhase1.repository.PersonRepo;
import com.medinaqenwan.qenwanPhase1.service.definition.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class DatabaseServiceImpl implements DatabaseService {
    @Autowired
    PersonRepo personRepo;

    @Override
    public Mono<Person> getPersonById(Long id) {
        return personRepo
                .findById(id)
                .map(
                        person -> {
                            System.out.println(person.toString());
                            return new Person(person);
                        });
    }

    @Override
    public Mono<List<Person>> searchPersonByName(String name) {
        return personRepo.findByNameContains(name).map(
                person -> {
                    System.out.println(person.toString());
                    return new Person(person);
                })
                .collectList();
    }
}
