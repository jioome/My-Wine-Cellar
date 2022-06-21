package com.example.mwcbackend.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.mwcbackend.oauth.BaseTimeEntity;
import com.example.mwcbackend.oauth.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Builder
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class IngredientIcon extends BaseTimeEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "icon_id")
	private Long iconId = null;

	@Column(name = "img_address")
	private String imgAddress;

	private Integer category;

}
