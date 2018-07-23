package com.ing.mercatus.tixclient.program;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class ProgramDTO {
    private final long id;
    private final String name;
}
