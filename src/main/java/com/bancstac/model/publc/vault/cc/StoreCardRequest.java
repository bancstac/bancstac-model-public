package com.bancstac.model.publc.vault.cc;

import java.util.Map;

import com.bancstac.model.publc.component.CreditCard;
import com.bancstac.model.publc.vault.BaseRequest;

import lombok.Getter;
import lombok.Setter;

public class StoreCardRequest extends BaseRequest {
	@Getter @Setter
    private String clientRef;
	@Getter @Setter
    private int clientId;
	@Getter @Setter
    private CreditCard creditCard;
	@Getter @Setter
    private String comment;
	@Getter @Setter
    private Map<String, String> extraData;
}