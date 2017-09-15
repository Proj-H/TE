package ed.persistence;

public class Stock{
	
	private int idStock;
	private String stockSymbol;
	private double averageDailyVolume;
	private double bidPrice;
	private double askRealtimePrice;
	private double bidRealtimePrice;
	private double bookValue;
	private double changePercentageChange;
	private double change;
	private double changeRealTime;
	private double dividendShare;
	private double lastTradeData;
	private double tradeData;
	private double earningsPerShare;
	private double daysLow;
	private double daysHigh;
	private double yearLow;
	private double yearHigh;
	
	public Stock(int idStock, String stockSymbol, double averageDailyVolume, double bidPrice, double askRealtimePrice,
			double bidRealtimePrice, double bookValue, double changePercentageChange, double change,
			double changeRealTime, double dividendShare, double lastTradeData, double tradeData,
			double earningsPerShare, double daysLow, double daysHigh, double yearLow, double yearHigh) {
		super();
		this.idStock = idStock;
		this.stockSymbol = stockSymbol;
		this.averageDailyVolume = averageDailyVolume;
		this.bidPrice = bidPrice;
		this.askRealtimePrice = askRealtimePrice;
		this.bidRealtimePrice = bidRealtimePrice;
		this.bookValue = bookValue;
		this.changePercentageChange = changePercentageChange;
		this.change = change;
		this.changeRealTime = changeRealTime;
		this.dividendShare = dividendShare;
		this.lastTradeData = lastTradeData;
		this.tradeData = tradeData;
		this.earningsPerShare = earningsPerShare;
		this.daysLow = daysLow;
		this.daysHigh = daysHigh;
		this.yearLow = yearLow;
		this.yearHigh = yearHigh;
	}

	public int getIdStock() {
		return idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public double getAverageDailyVolume() {
		return averageDailyVolume;
	}

	public void setAverageDailyVolume(double averageDailyVolume) {
		this.averageDailyVolume = averageDailyVolume;
	}

	public double getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}

	public double getAskRealtimePrice() {
		return askRealtimePrice;
	}

	public void setAskRealtimePrice(double askRealtimePrice) {
		this.askRealtimePrice = askRealtimePrice;
	}

	public double getBidRealtimePrice() {
		return bidRealtimePrice;
	}

	public void setBidRealtimePrice(double bidRealtimePrice) {
		this.bidRealtimePrice = bidRealtimePrice;
	}

	public double getBookValue() {
		return bookValue;
	}

	public void setBookValue(double bookValue) {
		this.bookValue = bookValue;
	}

	public double getChangePercentageChange() {
		return changePercentageChange;
	}

	public void setChangePercentageChange(double changePercentageChange) {
		this.changePercentageChange = changePercentageChange;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public double getChangeRealTime() {
		return changeRealTime;
	}

	public void setChangeRealTime(double changeRealTime) {
		this.changeRealTime = changeRealTime;
	}

	public double getDividendShare() {
		return dividendShare;
	}

	public void setDividendShare(double dividendShare) {
		this.dividendShare = dividendShare;
	}

	public double getLastTradeData() {
		return lastTradeData;
	}

	public void setLastTradeData(double lastTradeData) {
		this.lastTradeData = lastTradeData;
	}

	public double getTradeData() {
		return tradeData;
	}

	public void setTradeData(double tradeData) {
		this.tradeData = tradeData;
	}

	public double getEarningsPerShare() {
		return earningsPerShare;
	}

	public void setEarningsPerShare(double earningsPerShare) {
		this.earningsPerShare = earningsPerShare;
	}

	public double getDaysLow() {
		return daysLow;
	}

	public void setDaysLow(double daysLow) {
		this.daysLow = daysLow;
	}

	public double getDaysHigh() {
		return daysHigh;
	}

	public void setDaysHigh(double daysHigh) {
		this.daysHigh = daysHigh;
	}

	public double getYearLow() {
		return yearLow;
	}

	public void setYearLow(double yearLow) {
		this.yearLow = yearLow;
	}

	public double getYearHigh() {
		return yearHigh;
	}

	public void setYearHigh(double yearHigh) {
		this.yearHigh = yearHigh;
	}
	
	
	
}