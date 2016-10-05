package Model;

public class MaoDeObra {

	private int id;
	private int idOs;
	private int cod;
	private double qtd;
	private double qtdCobrada;
	
	public MaoDeObra(int id, int idOs, int cod, double qtd, double qtdCobrada) {
		super();
		this.id = id;
		this.idOs = idOs;
		this.cod = cod;
		this.qtd = qtd;
                this.qtdCobrada = qtdCobrada;
	}
	public MaoDeObra() {
		
	}
	
	
	public double getQtdCobrada() {
		return qtdCobrada;
	}
	public void setQtdCobrada(double qtdCobrada) {
		this.qtdCobrada = qtdCobrada;
	}
	@Override
	public String toString() {
		
		return id+"";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdOs() {
		return idOs;
	}
	public void setIdOs(int idOs) {
		this.idOs = idOs;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public double getQtd() {
		return qtd;
	}
	public void setQtd(double qtd) {
		this.qtd = qtd;
	}
	
	
}
