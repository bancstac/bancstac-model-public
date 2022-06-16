package com.bancstac.model.publc.vault.cc;

import com.bancstac.model.publc.vault.BaseRequest;

import lombok.Getter;
import lombok.Setter;

public class DeleteTokenRequest extends BaseRequest {
	@Getter @Setter
    private String token;
	@Getter @Setter
    private int clientId;
}