package com.example.mwcbackend.oauth;

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
public class User extends BaseTimeEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId = null;

    @Column(name = "social_id")
    private Long socialId;

    @Column(nullable = false)
    private String email;

    @Column(name = "nick_name")
    private String nickName;

    private String picture;


    private String status;

    private String follower;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;


}

