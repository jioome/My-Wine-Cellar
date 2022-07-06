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
public class GuestBook extends BaseTimeEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guestbook_id")
    private Long guestbookId = null;

    // Guestbook Entity는 관계의 주인이기 때문에, FK 키 포함
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String content;
}
