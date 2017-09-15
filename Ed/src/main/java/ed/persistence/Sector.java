package ed.persistence;

public class Sector{
	
	private int idSector;
	private String sectorName;
	
	public Sector(int idSector, String sectorName) {
		super();
		this.idSector = idSector;
		this.sectorName = sectorName;
	}

	public int getIdSector() {
		return idSector;
	}

	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	
	
	
}