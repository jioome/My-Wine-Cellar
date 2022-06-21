package com.example.mwcbackend.domain;

import com.example.mwcbackend.oauth.BaseTimeEntity;
import com.example.mwcbackend.oauth.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WineIcon extends BaseTimeEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wine_id")
    private Long wineId = null;

    @Column(name = "img_address")
    private String imgAddress;

    private Integer bubble;
    private Integer shape;
    private Integer color;

}
