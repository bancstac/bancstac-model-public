package com.bancstac.model.publc.component;

import lombok.Getter;
import lombok.Setter;

public class CreditCard {
    @Getter @Setter
    private String type;
    @Getter @Setter
    private String holderName;
    @Getter @Setter
    private String number;
    @Getter @Setter
    private String expiry;
    @Getter @Setter
    private String secureId;
    @Getter @Setter
    private Boolean secureIdSupplied;
    @Getter @Setter
    private String track1;
    @Getter @Setter
    private String track2;
    @Getter @Setter
    private String track3;
    @Getter @Setter
    private String cardChipData;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreditCard [type=").append(type)
				.append(", holderName=").append(holderName);
		if(number != null) {
			int cardLen = number.length();
			builder.append(", number=")
			.append(number.substring(0, 6)).append(new String(new char[cardLen - 10]).replace("\0", "*"))
			.append(number.substring(cardLen - 4));
		}
		builder.append(", expiry=").append(expiry)
				.append(", secureId=").append("***")
				.append(", secureIdSupplied=").append(secureIdSupplied)
				.append(", track1=").append(track1)
				.append(", track2=").append(track2)
				.append(", track3=").append(track3)
				.append(", cardChipData=").append(cardChipData)
				.append("]");
		return builder.toString();
	}
}