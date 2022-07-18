package com.bancstac.model.publc.root;

import java.util.Date;

import com.bancstac.model.publc.deserializer.JsonRawValueDeserializer;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class BancstacRequest {
	@Getter @Setter
	private String version;
	@Getter @Setter
	private String msgId;
	@Getter @Setter
	private String operation;
	@Getter @Setter
	private Date requestDate;
	@Getter @Setter
	private boolean validateOnly;
	@Getter @Setter
	private String serviceId;
	@Getter @Setter
	private String resource;
	@Getter @Setter
	private String action;
	@JsonDeserialize(using = JsonRawValueDeserializer.class)
	@JsonRawValue
	@Getter @Setter
	private String requestData;
	@Getter @Setter
	private String serviceIdSuffix;
	@Getter @Setter
	private long expiration;
}