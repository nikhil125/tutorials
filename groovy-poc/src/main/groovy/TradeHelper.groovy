class TradeHelper {
	private TradeHolder holder;

	TradeHelper(TradeHolder holder) {
		this.holder = holder
	}

	def methodMissing(String name, args) {
		System.out.println("Intercepting method $name with arguments $args")
	}

	def run(Closure closure) {
		closure(holder.getToday(), holder.getYesterday())
	}

	def today(closure) {
		closure(holder.getToday())
	}

	def yesterday(closure) {
		closure(holder.yesterday())
	}
}