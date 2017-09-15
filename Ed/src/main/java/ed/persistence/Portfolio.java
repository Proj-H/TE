package ed.persistence;

public class Portfolio{
	
	private int idPortfolio;
	private String portfolioName;
	
	public Portfolio(int idPortfolio, String portfolioName) {
		super();
		this.idPortfolio = idPortfolio;
		this.portfolioName = portfolioName;
	}

	public int getIdPortfolio() {
		return idPortfolio;
	}

	public void setIdPortfolio(int idPortfolio) {
		this.idPortfolio = idPortfolio;
	}

	public String getPortfolioName() {
		return portfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
	
	
	
}