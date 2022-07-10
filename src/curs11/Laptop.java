package curs11;

public class Laptop extends Product{

	private int buyingPrice;
	private int tva;
	private int adaosComercial;
	
	public Laptop(int buyPrice, int tva, int adaos) {
		setAdaosComercial(adaos);
		setBuyingPrice(buyPrice);
		setTVA(tva);
	}
	
	public int getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	
	public int getTVA() {
		return tva;
	}

	public void setTVA(int tVA) {
		this.tva = tVA;
	}

	public int getAdaosComercial() {
		return adaosComercial;
	}

	public void setAdaosComercial(int adaosComercial) {
		this.adaosComercial = adaosComercial;
	}

	@Override
	public int calculatePrice() {
		return tva + buyingPrice + adaosComercial;
	}

}
