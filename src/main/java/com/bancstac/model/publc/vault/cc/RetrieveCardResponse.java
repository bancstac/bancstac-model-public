package com.bancstac.model.publc.vault.cc;

import com.bancstac.model.publc.component.CreditCard;

import lombok.Getter;
import lombok.Setter;

public class RetrieveCardResponse {
	@Getter @Setter
    private CreditCard creditCard;
	@Getter @Setter
    private String clientRef;
	@Getter @Setter
    private String responseCode;
	@Getter @Setter
    private String responseText;
	@Getter @Setter
    private Boolean completed;
}