package com.example.mwcbackend.oauth;

import lombok.*;
//import org.springframework.security.core.GrantedAuthority;
import javax.persistence.*;
import java.util.Collection;
import java.io.Serializable;

@Builder
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @Column(name = "user_id")
    private Long userId = null;

    @Column(name = "social_id")
    private Long socialId;

    @Column(nullable = false)
    private String email;

    @Column(name = "nick_name")
    private String nickName;

    private String picture;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;




}
