package com.bancstac.model.publc.root;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class BancstacError {
	@Getter @Setter
	private String code;
	@Getter @Setter
	private String text;
}