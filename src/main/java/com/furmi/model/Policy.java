package com.furmi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Policy {
    @JsonProperty("PolicyName")
    private String policyName;
    @JsonProperty("PolicyDocument")
    private PolicyDocument policyDocument;
}
