package edu.goit.entity;

import lombok.Data;

@Data
public class Note {
    private long id;
    private String name;
    private String content;
}
