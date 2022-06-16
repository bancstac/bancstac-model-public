package com.bancstac.model.publc.vault.cc;

import lombok.Getter;
import lombok.Setter;

public class UpdateCardResponse {
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