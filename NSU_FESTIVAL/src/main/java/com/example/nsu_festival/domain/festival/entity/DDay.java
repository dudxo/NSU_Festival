package com.example.nsu_festival.domain.festival.entity;

import lombok.Getter;

@Getter
public enum DDay {
    FIRST_DATE("2024-04-23"),
    SECOND_DATE("2024-04-24"),
    LAST_DATE("2024-04-25");

    private final String date;

    DDay(String date){
        this.date = date;
    }
}
