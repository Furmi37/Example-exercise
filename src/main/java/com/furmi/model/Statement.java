package com.furmi.model;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Statement {
    private String sid;
    private String effect;
    private List<String> action;
    private String resource;

}
