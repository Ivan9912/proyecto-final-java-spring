package com.ar.cac.tpfinal.entities.dtos;

import jakarta.persistence.AccessType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private Long id;
    private AccessType type;
    private String cbu;
    private String alias;
    private BigDecimal balance;
}
