public class Media{
	private double n1,trab,n2,mfinal,progresso;
	
	public double getN1 (){
		return n1;
	}
	public double getN2 (){
		return n2;
	}
	public double getMfinal (){
		return mfinal = n1+n2;
	}
	public double getTrab (){
		return trab;
	}
	public double getProgresso(){
		return progresso;
	}
	
	public void setN1(double n1){
		this.n1 = n1;
	}
	public void setN2(double n2){
		this.n2 = n2;
	}
	public void setTrab(double trab){
		this.trab = trab;
	}
	public void setProgresso(double progresso){
		this.progresso = progresso;
	}
	
	public void setCalculaN1(){
		this.n1 = ((n1+progresso)/2)*0.4;
	}
	public void setCalculaN2(){
		this.n2 = n2*0,6;
	}
	public void setCalculaTrab(){
		this.trab = trab/2;
	}

}