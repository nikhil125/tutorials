import java.time.LocalDate;

public class TradeHolder {
	private Trade today = new Trade("T1", LocalDate.of(2016, 2, 2), 1);
	private Trade yesterday = new Trade("T1", LocalDate.of(2016, 2, 1), 2);

	public Trade getToday() {
		return today;
	}

	public void setToday(Trade today) {
		this.today = today;
	}

	public Trade getYesterday() {
		return yesterday;
	}

	public void setYesterday(Trade yesterday) {
		this.yesterday = yesterday;
	}

	@Override
	public String toString() {
		return "TradeHolder{" +
				"today=" + today +
				", yesterday=" + yesterday +
				'}';
	}
}
