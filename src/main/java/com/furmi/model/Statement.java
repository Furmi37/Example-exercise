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
public class Statement {
    @JsonProperty("Sid")
    private String sid;
    @JsonProperty("Effect")
    private String effect;
    @JsonProperty("Action")
    private List<String> action;
    @JsonProperty("Resource")
    private String resource;

}
