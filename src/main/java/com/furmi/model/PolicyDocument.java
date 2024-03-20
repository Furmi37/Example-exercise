package com.furmi.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PolicyDocument {
    private String version;
    private List<Statement> statement;
}
