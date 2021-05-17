package br.edu.ifcvideira.lista15;

public class Ex1Computador {
	
	private double placaMae;
	private double hd;
	private double memoria;
	private double processador;
	private double placaVideo;
	
	private int volumes;
	
	private int garantia;
	
	private String configuracao;
	
	public Ex1Computador() {
	
	}

	public Ex1Computador(double placaMae, double hd, double memoria, double processador, double placaVideo, int volumes,
			int garantia, String configuracao) {
		super();
		this.placaMae = placaMae;
		this.hd = hd;
		this.memoria = memoria;
		this.processador = processador;
		this.placaVideo = placaVideo;
		this.volumes = volumes;
		this.garantia = garantia;
		this.configuracao = configuracao;
	}

	public double getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(double placaMae) {
		this.placaMae = placaMae;
	}

	public double getHd() {
		return hd;
	}

	public void setHd(double hd) {
		this.hd = hd;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double getProcessador() {
		return processador;
	}

	public void setProcessador(double processador) {
		this.processador = processador;
	}

	public double getPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(double placaVideo) {
		this.placaVideo = placaVideo;
	}

	public int getVolumes() {
		return volumes;
	}

	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public String getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}
	
	public double calculaPreco() {
		return 0;
	}
	
	public void imprime() {
		
	}
	
	public void imprimeGarantia() {
		
	}
	
}
