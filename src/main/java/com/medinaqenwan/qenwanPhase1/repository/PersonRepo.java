package com.medinaqenwan.qenwanPhase1.repository;

import com.medinaqenwan.qenwanPhase1.model.dto.PersonDto;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

//ToDO
@Repository
public interface PersonRepo extends ReactiveCrudRepository<PersonDto, Long> {
    Flux<PersonDto> findByName(String name);

    Flux<PersonDto> findByNameContains(String namePart);
}
