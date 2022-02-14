package cuentas;

/**
 * CCuenta: programa que gestiona una cuenta de banco ya sea ingresando o retirando saldo.
 * 
 * Los datos de cada cuenta son:
 * nombre
 * saldo
 * cuenta
 * tipo de interes
 * 
 * @since 2022-02-07
 * @author Adriana 
 * @version v2
 * @see main 
 */
public class CCuenta {
	

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }
    /**
     * 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	/**
	 * 
	 * @return saldo actual de la cuenta
	 */
	public double estado()
    {
        return saldo;
    }

	/**
	 * Ingresa una cantidad positiva en la cuenta
	 * @param cantidad
	 * @throws Exception
	 */
	
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad positiva de la cuenta
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
