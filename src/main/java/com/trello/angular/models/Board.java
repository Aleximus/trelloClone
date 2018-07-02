package com.trello.angular.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Alex on 28/06/2018.
 */
@Document(collection = "board")
public class Board {
    @Id
    String id;
    String name;

    public Board() {
    }

    public Board(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
