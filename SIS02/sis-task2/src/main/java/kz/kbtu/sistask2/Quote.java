package kz.kbtu.sistask2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(String type, Value value) { }
