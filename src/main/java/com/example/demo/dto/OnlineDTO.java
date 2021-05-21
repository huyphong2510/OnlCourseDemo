package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class OnlineDTO implements Serializable {
    private Long id;

    private String full_name;

    private Integer price;

    private String author;

}
