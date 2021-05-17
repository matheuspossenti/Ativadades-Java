package br.edu.ifcvideira.lista10;

public class Computador {
	
	private double processador;
	private double memoria;
	private double hd;
	private double monitor;
	private String config = "";
	
	public double getProcessador() {
		return processador;
	}

	public void setProcessador(double processador) {
		this.processador = processador;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double getHd() {
		return hd;
	}

	public void setHd(double hd) {
		this.hd = hd;
	}

	public double getMonitor() {
		return monitor;
	}

	public void setMonitor(double monitor) {
		this.monitor = monitor;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}
	
public Computador() {
		
	}

	public Computador(double processador, double memoria, double hd, double monitor, String config) {
		super();
		this.processador = processador;
		this.memoria = memoria;
		this.hd = hd;
		this.monitor = monitor;
		this.config = config;
	}
	
	public double calcularPreco() {
		return 800 + this.getProcessador() + this.getMemoria() + this.getHd() + this.getMonitor();
	}
}
