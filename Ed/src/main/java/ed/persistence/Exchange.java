package ed.persistence;

public class Exchange{
	
	private int idExchange;
	private String exchangeName;
	
	public Exchange(int idExchange, String exchangeName) {
		super();
		this.idExchange = idExchange;
		this.exchangeName = exchangeName;
	}

	public int getIdExchange() {
		return idExchange;
	}

	public void setIdExchange(int idExchange) {
		this.idExchange = idExchange;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}
	
	
	
}