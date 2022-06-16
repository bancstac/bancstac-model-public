package com.bancstac.model.publc.component;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class CreditDetailRecord {

	@Getter
	@Setter
	private String txnReference;
	@Getter
	@Setter
	private String transactionType;
	@Getter
	@Setter
	private String clientId;
	@Getter
	@Setter
	private String customerId;
	@Getter
	@Setter
	private String responseCode;
	@Getter
	@Setter
	private String responseText;
	@Getter
	@Setter
	private String authCode;
	@Getter
	@Setter
	private String creditCardNumber;
	@Getter
	@Setter
	private String creditCardExpiry;
	@Getter
	@Setter
	private String creditCardType;
	@Getter
	@Setter
	private String creditCardHolderName;
	@Getter
	@Setter
	private String terminalType;
	@Getter
	@Setter
	private String settlementDate;
	@Getter
	@Setter
	private Date eventTime;
	@Getter
	@Setter
	private String terminalId;
	@Getter
	@Setter
	private String merchantId;
	@Getter
	@Setter
	private String stan;
	@Getter
	@Setter
	private String comment;
	@Getter
	@Setter
	private String clientRef;
	@Getter
	@Setter
	private int paymentAmount;
	@Getter
	@Setter
	private String currency;
	@Getter
	@Setter
	private String batchReference;
	@Getter
	@Setter
	private String originalTxnReference;
}