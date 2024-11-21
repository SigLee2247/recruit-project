package com.pentasecurity.biztask.domain.user.persistance.entity;

import com.pentasecurity.biztask.domain.user.persistance.enums.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Getter
@Table(name = "SYSTEM_USER")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class SystemUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_idx")
    private Long idx;

    @Column(name = "user_id", nullable = false, length = 30)
    private String id;

    @Column(name = "user_pw", nullable = false, length = 100)
    private String pw;

    @Column(name = "user_nm", nullable = false, length = 100)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_auth", nullable = false, length = 20)
    private UserRole auth;
}
