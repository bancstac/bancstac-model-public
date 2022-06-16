package com.bancstac.model.publc.vault.cc;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class VerifyTokenResponse implements Serializable {
	private static final long serialVersionUID = 316948754L;
	@Getter @Setter
	private String token;
	@Getter @Setter
    private String clientRef;
	@Getter @Setter
    private String responseCode;
	@Getter @Setter
    private String responseText;
	@Getter @Setter
    private Boolean completed;
	@Getter @Setter
    private String authResponseCode;
	@Getter @Setter
    private String authResponseText;
	@Getter @Setter
    private String authTxnRef;
}