package com.pentasecurity.biztask.domain.user.persistance.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ActionType {
    C("Create"),
    U("Update"),
    D("Delete")
    ;

    private final String description;
}
