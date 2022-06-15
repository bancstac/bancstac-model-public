package com.bancstac.model.report;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.bancstac.model.enums.DateType;
import com.bancstac.model.enums.TransactionType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class BasicReportRequest {

	@Getter
	@Setter
	private Date fromDate;
	@Getter
	@Setter
	private Date toDate;
	@Getter
	@Setter
	private DateType dateType = DateType.EVENT;
	@Getter
	@Setter
	private Integer customerId;
	@Getter
	@Setter
	private List<Integer> clientIds;
	@Getter
	@Setter
	private String batchReference;
	@Getter
	@Setter
	private String txnReference;
	@Getter
	@Setter
	private List<TransactionType> transactionTypes;
	@Getter
	@Setter
	private String creditCardNumber;
	@Getter
	@Setter
	private String creditCardExpiry;
	@Getter
	@Setter
	private List<String> creditCardTypes;
	@Getter
	@Setter
	private List<String> responseCodes;
	@Getter
	@Setter
	private String clientRef;
	@Getter
	@Setter
	private Integer minAmount;
	@Getter
	@Setter
	private Integer maxAmount;
	@Getter
	@Setter
	private Integer resultsetSize = 10;
	@Getter
	private BigDecimal timezone;

	public void setTimezone(BigDecimal timezone) {
		this.timezone = timezone;
	}

	public void setTimezone(Double timezoneD) {
		if (timezoneD == null) {
			return;
		}
		this.timezone = BigDecimal.valueOf(timezoneD);
	}
}