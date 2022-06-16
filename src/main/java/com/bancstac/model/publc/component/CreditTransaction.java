package com.bancstac.model.publc.component;

import java.util.Map;

import com.bancstac.model.publc.enums.TransactionType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class CreditTransaction {

	@Getter
	@Setter
	private Integer clientId;
	@Getter
	@Setter
	private String originalTxnReference;
	@Getter
	@Setter
	private CreditCard creditCard;
	@Getter
	@Setter
	private TransactionType transactionType;
	@Getter
	@Setter
	private TransactionAmount transactionAmount;
	@Getter
	@Setter
	private String clientRef;
	@Getter
	@Setter
	private String comment;
	@Getter
	@Setter
	private Map<String, String> extraData;
}