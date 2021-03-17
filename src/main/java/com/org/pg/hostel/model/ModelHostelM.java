package com.org.pg.hostel.model;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;


@Document
@Setter
@Getter
public class ModelHostelM {
    private int rooms;
    private String Type;
    @Id
    private String quality;
    private int cost;
}
