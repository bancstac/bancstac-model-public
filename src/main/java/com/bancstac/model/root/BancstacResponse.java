package com.bancstac.model.root;

import com.bancstac.model.deserializer.JsonRawValueDeserializer;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class BancstacResponse {
	@Getter @Setter
	private String msgId;
	@Getter @Setter
	private BancstacError error;
	@Getter @Setter
	private String sessionStatus;//
	@JsonDeserialize(using = JsonRawValueDeserializer.class)
	@JsonRawValue
	@Getter @Setter
	private String responseData;

	public BancstacResponse(BancstacRequest paycorpRequest) {
		this.msgId = paycorpRequest.getMsgId();
	}
}