package com.bancstac.model.report;

import java.util.Date;
import java.util.List;

import com.bancstac.model.component.CreditDetailRecord;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class BasicReportResponse {

	@Getter
	@Setter
	private Date responseDate;
	@Getter
	@Setter
	private List<CreditDetailRecord> creditDetailRecords;
}