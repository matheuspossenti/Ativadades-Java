package br.edu.ifcvideira.lista9;

public class InvertValor {
		private int n1;
		private int n2;
		private int nn;
		
		public int getN1() {
			return n1;
		}
		
		public void setN1(int n1) {
			this.n1 = n1;
		}
		
		public int getN2() {
			return n2;
		}
		
		public void setN2(int n2) {
			this.n2 = n2;
		}
		
		public int getNn() {
			return nn;
		}
		
		public void setNn(int nn) {
			this.nn = nn;
		}
		
		public void trocaValores() {
			nn = getN1();
			setN1(getN2());
			setN2(nn);
		}
}