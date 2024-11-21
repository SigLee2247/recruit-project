package com.pentasecurity.biztask.domain.user.persistance.entity;

import com.pentasecurity.biztask.domain.user.persistance.enums.ActionType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Getter
@Table(name = "USER_HISTORY")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class UserHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_idx")
    private Long idx;

    @Column(name = "url", nullable = false, columnDefinition = "TEXT")
    private String url;

    @Enumerated(EnumType.STRING)
    @Column(name = "action_type", nullable = false, length = 1)
    private ActionType actionType;

    @Column(name = "reg_user_idx", nullable = false)
    private Long regUserIdx;

    @Column(name = "reg_ip", nullable = false, length = 16)
    private String regIp;

    @Column(name = "reg_dt", nullable = false)
    private LocalDateTime regDt;
}