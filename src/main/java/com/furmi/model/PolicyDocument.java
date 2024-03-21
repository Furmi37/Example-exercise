package com.furmi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PolicyDocument {
    @JsonProperty("Version")
    private String version;
    @JsonProperty("Statement")
    private List<Statement> statement;
}
