package com.furmi.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Policy {
    private String policyName;
    private PolicyDocument policyDocument;
}
