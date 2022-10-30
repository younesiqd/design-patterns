import java.util.ArrayList;

public class Article {
	protected Paiement Art;
	private int code;
	private float prix;
	public void payerArt() {
		Art.payer();
	}
	public Paiement getArt() {
		return Art;
	}
	public void setArt(Paiement art) {
		Art = art;
	}
	public void calculerPrixTotale(Article article) {
		System.out.println("donnez prix totale");
		}
		
	}
	


