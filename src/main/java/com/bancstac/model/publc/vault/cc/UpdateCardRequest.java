package com.bancstac.model.publc.vault.cc;

import java.util.Map;

import com.bancstac.model.publc.vault.BaseRequest;

import lombok.Getter;
import lombok.Setter;

public class UpdateCardRequest extends BaseRequest {
	@Getter @Setter
    private String token;
	@Getter @Setter
    private String expiryDate;
	@Getter @Setter
    private int clientId;
	@Getter @Setter
    private String clientRef;
	@Getter @Setter
    private String comment;
	@Getter @Setter
    private Map<String, String> extraData;
}