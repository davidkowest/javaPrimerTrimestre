package ejer05;
/**
 * 
 * @author Davidkowest
 *
 */
public class Empleado  {
	//Atributos
	
	private String nif;
	private float sbase;
	private float pagohoraextra;
	private int horasextras;
	private float irpf;
	private boolean casado;
	private int nhijos;
	
	
	
	//Constructores
	/**
	 * Constructor vacio que inicializa la clase empleado
	 */
	public Empleado () {
		
	}
	/**
	 * Constructor vacio que inicializa con el siguiente parametro
	 * @param nif
	 */
	public Empleado (String nif) {
		this.nif=nif;
	}
	
	
	
	//Metodos
	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public float getSbase() {
		return sbase;
	}
	public void setSbase(float sbase) {
		this.sbase = sbase;
	}
	public float getPagohoraextra() {
		return pagohoraextra;
	}
	public void setPagohoraextra(float pagohoraextra) {
		this.pagohoraextra = pagohoraextra;
	}
	public int getHorasextras() {
		return horasextras;
	}
	public void setHorasextras(int horasextras) {
		this.horasextras = horasextras;
	}
	public float getIrpf() {
		return irpf;
	}
	public void setIrpf(float irpf) {
		this.irpf = irpf;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public int getNhijos() {
		return nhijos;
	}
	public void setNhijos(int nhijos) {
		this.nhijos = nhijos;
	}
	
	/**
	 * Metodo que nos devuelve el complemento de horas extras
	 * @return
	 */
	public float complementoHorasExtras () {
		return pagohoraextra*horasextras;
	}
	/**
	 * metodo que nos devuelve el sueldo bruto
	 * @return
	 */
	public float sbruto () {
		return pagohoraextra*horasextras+sbase;
	}
	/**
	 * Metodo que nos devuelve la retencion segun si esta casado o no y se reduce segun los hijos que tenga
	 * @return
	 */
	public float retencion () {
		
		if (casado) {
			return (pagohoraextra*horasextras+sbase)*(irpf-2-nhijos)/100;
		} else {
			return (pagohoraextra*horasextras+sbase)*(irpf-2-nhijos)/100;
		}
		
	}

	/**
	 * Metodo que nos devuelve informacion basica del empleado
	 * @return
	 */
	public String println() {
		return "Empleado [nif=" + nif + ", casado=" + casado + ", nhijos=" + nhijos + "]";
	}

	/**
	 * Metodo que nos devuelve una informacion completa del empleado
	 * @return
	 */
	public String printall() {
		return "Empleado [nif=" + nif + ", sbase=" + sbase + ", casado=" + casado + ", nhijos=" + nhijos
				+ ", complementoHorasExtras()=" + complementoHorasExtras() + ", sbruto()=" + sbruto() + ", retencion()="
				+ retencion() +", sneto="+(sbruto()-retencion())+ "]";
	}

	/**
	 * Metodo que nos clona un empleado a partir de otro
	 * @param empleado
	 */
	public void copia (Empleado empleado) {
		this.nif=empleado.nif;
		this.sbase=empleado.sbase;
		this.pagohoraextra=empleado.pagohoraextra;
		this.horasextras=empleado.horasextras;
		this.irpf=empleado.irpf;
		this.nhijos=empleado.nhijos;
		this.casado=empleado.casado;
	}
	
	
	
}
