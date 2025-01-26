package com.medinaqenwan.qenwanPhase1.model.pojo;

import com.google.gson.Gson;
import com.medinaqenwan.qenwanPhase1.model.dto.PersonDto;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person {
    private Long id;
    private String name;
    private String email;

    public Person(PersonDto other) {
        this.id = other.getId();
        this.name = other.getName();
        this.email = other.getEmail();
    }


    @Override
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;

    }
}
