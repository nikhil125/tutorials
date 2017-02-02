import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Trade {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.BASIC_ISO_DATE;
	private String tradeId;
	private LocalDate asof;
	private long value;

	public Trade(String tradeId, LocalDate asof, long value) {
		this.tradeId = tradeId;
		this.asof = asof;
		this.value = value;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public LocalDate getAsof() {
		return asof;
	}

	public void setAsof(LocalDate asof) {
		this.asof = asof;
	}

	public long getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Trade{" +
				"tradeId='" + tradeId + '\'' +
				", asof=" + FORMATTER.format(asof) +
				'}';
	}
}
