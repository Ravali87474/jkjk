package com.org.pg.hostel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@Table
public class ModelHostelS {
    private int rooms;
    private String Type;
    @Id
    private String quality;
    private int cost;
}
