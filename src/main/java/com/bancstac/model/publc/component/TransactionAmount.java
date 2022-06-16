package com.bancstac.model.publc.component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class TransactionAmount {
	/**
	 * Total amount in cents, only required if service fee amount is provided.
	 */
	@Getter @Setter
	private int totalAmount;
	/**
	 * sPayment amount in cents
	 */
	@Getter @Setter
	private int paymentAmount;
	/**
	 * Service fee amount, if set, total amount should be set to sum of payment amount and service fee amount
	 */
	@Getter @Setter
	private int serviceFeeAmount;
	/**
	 * Three character ISO code of the currency, refer
	 * see <a href="http://en.wikipedia.org/wiki/ISO_4217"></a> for more details.
	 */
	@Getter @Setter
	private int withholdingAmount;
	@Getter @Setter
	private String currency;
}