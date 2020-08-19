package br.com.marcelosouza.santander;

// GitHub: MarceloSouza1983		e-mail: map.souza1983@gmail.com		Cel: (12) 98813-6040

public class Cliente {

    private String sobrenome, rg, cpf;
    private long id;

    public Cliente(String sobrenome, String rg, String cpf, long id) {
    	setSobrenome(sobrenome);
    	setRg(rg);
        setCpf(cpf);
        setId(id);
    }

    public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
        return this.cpf;
    }
	
	public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getId() {
    	return this.id;
    }
    
    public void setId(long id) {
    	this.id = id;
    }

    public void imprimeDados() {
        System.out.println("-------------------------------");
        System.out.println("Nome do cliente: " + this.getSobrenome());
        System.out.println("RG: " + this.getRg());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("ID do cliente: " + this.getId());
        System.out.println("------------------------------\n");
    }

}