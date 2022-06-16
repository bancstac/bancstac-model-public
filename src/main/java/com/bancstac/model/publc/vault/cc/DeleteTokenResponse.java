package com.bancstac.model.publc.vault.cc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class DeleteTokenResponse {
	@Getter @Setter
    private String responseCode;
	@Getter @Setter
    private String responseText;
	@Getter @Setter
    private Boolean completed;
}