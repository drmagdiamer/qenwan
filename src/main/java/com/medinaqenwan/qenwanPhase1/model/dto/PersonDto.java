package com.medinaqenwan.qenwanPhase1.model.dto;

import com.google.gson.Gson;

import com.medinaqenwan.qenwanPhase1.model.pojo.Person;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table("person")
public class PersonDto {
    @Id private Long id;
    @Column("name")
    private String name;
    private String email;

    public PersonDto(Person other) {
        this.id = other.getId();
        this.name = other.getName();
        this.email = other.getEmail();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }
}
