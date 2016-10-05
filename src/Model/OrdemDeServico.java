package Model;

import java.util.ArrayList;
import java.util.Date;

public class OrdemDeServico {

	private int id;
	
	//InfoSamae
	private String numeroOrdem;
	private Date dataEmissao;
	
	//Dados Informados
	private String cliente;
	private String ruaCliente;
	private String complementoCliente;
	private long telefoneCliente;
	private Bairros bairro;
	private int numero;
	private String servicosAExecutar;
	private int urgencia;
	private String referencia;
	private int lote;
        private int obrasCivis;
	
	//Dados do cadastro
	private int codRua;
	private int codSetor;
	private long nHidrometro;
	private InfoCad infosCad;
	
	
	private String obs;

	private Status status;
	
	//Dados Ordem de Servico
	private Date dataInicial;
	private Date dataFinal;
	private ArrayList<MaoDeObra> maoDeObra;
	private boolean asfalto;
	private boolean calcada;
	private boolean esgoto;
	private boolean calcamento;
	
	private int equipe;
        
        private int cdLicitacao;
	
	public int getUrgencia() {
		return urgencia;
	}
	public void setUrgencia(int urgencia) {
		this.urgencia = urgencia;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String transversal) {
		this.referencia = transversal;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getServicosAExecutar() {
		return servicosAExecutar;
	}
	public void setServicosAExecutar(String servicosAExecutar) {
		this.servicosAExecutar = servicosAExecutar;
	}
	
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	public ArrayList<MaoDeObra> getMaoDeObra() {
		return maoDeObra;
	}
	public void setMaoDeObra(ArrayList<MaoDeObra> maoDeObra) {
		this.maoDeObra = maoDeObra;
	}
	public boolean isAsfalto() {
		return asfalto;
	}
	public void setAsfalto(boolean asfalto) {
		this.asfalto = asfalto;
	}
	public boolean isCalcada() {
		return calcada;
	}
	public void setCalcada(boolean calcada) {
		this.calcada = calcada;
	}
	public boolean isEsgoto() {
		return esgoto;
	}
	public void setEsgoto(boolean esgoto) {
		this.esgoto = esgoto;
	}
	public boolean isCalcamento() {
		return calcamento;
	}
	public void setCalcamento(boolean calcamento) {
		this.calcamento = calcamento;
	}
	
	@Override
	public String toString() {
	
		return ""+id;
	}
	public String getNumeroOrdem() {
		return numeroOrdem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String ordem() {
		return numeroOrdem;
	}
	public void setNumeroOrdem(String numeroOrdem) {
		this.numeroOrdem = numeroOrdem;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getRuaCliente() {
		return ruaCliente;
	}
	public void setRuaCliente(String ruaCliente) {
		this.ruaCliente = ruaCliente;
	}
	public String getComplementoCliente() {
		return complementoCliente;
	}
	public void setComplementoCliente(String complementoCliente) {
		this.complementoCliente = complementoCliente;
	}
	public long getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(long telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public Bairros getBairro() {
		return bairro;
	}
	public void setBairro(Bairros bairro) {
		this.bairro = bairro;
	}
	public int getCodRua() {
		return codRua;
	}
	public void setCodRua(int codRua) {
		this.codRua = codRua;
	}
	public int getCodSetor() {
		return codSetor;
	}
	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}
	public long getnHidrometro() {
		return nHidrometro;
	}
	public void setnHidrometro(long nHidrometro) {
		this.nHidrometro = nHidrometro;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public int getEquipe() {
		return equipe;
	}
	public void setEquipe(int equipe) {
		this.equipe = equipe;
	}
	public InfoCad getInfosCad() {
		return infosCad;
	}
	public void setInfosCad(InfoCad infosCad) {
		this.infosCad = infosCad;
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}

        public int getObrasCivis(){
            return this.obrasCivis;
        }
        
        public void setObrasCivis(int obrasCivis){
            this.obrasCivis = obrasCivis;
        }

    public int getCdLicitacao() {
        return cdLicitacao;
    }

    public void setCdLicitacao(int cdLicitacao) {
        this.cdLicitacao = cdLicitacao;
    }
	
	
	
}
