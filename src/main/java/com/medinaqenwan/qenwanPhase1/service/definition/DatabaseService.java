package com.medinaqenwan.qenwanPhase1.service.definition;

import com.medinaqenwan.qenwanPhase1.model.pojo.Person;
import reactor.core.publisher.Mono;

import java.util.List;

public interface DatabaseService {
    Mono<Person> getPersonById(Long id);
    Mono<List<Person>> searchPersonByName(String name);
}
