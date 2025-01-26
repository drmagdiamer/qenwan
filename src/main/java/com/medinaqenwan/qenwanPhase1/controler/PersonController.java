package com.medinaqenwan.qenwanPhase1.controler;

import com.medinaqenwan.qenwanPhase1.model.pojo.Person;
import com.medinaqenwan.qenwanPhase1.service.definition.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    DatabaseService db;

    @GetMapping("/test")
    public Mono<String> testEndpoint() {
        // Return a simple string
        return Mono.just("Test endpoint reached!");
    }

    @GetMapping("/person/{id}")
    public Mono<Person> getUser(@PathVariable("id") long id) {
        return db.getPersonById(id);
    }

    @GetMapping("/personSearch/{name}")
    public Mono<List<Person>>  personSearch(@PathVariable("name") String name) {
        return db.searchPersonByName(name);
    }
}