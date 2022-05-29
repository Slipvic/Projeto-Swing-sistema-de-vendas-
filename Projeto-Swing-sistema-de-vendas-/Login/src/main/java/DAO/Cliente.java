package DAO;

public class Cliente {
    
        //dados residenciais
        public int CEP;
        public String Endereco;
        public int Numero;
        public String Complemento;
        public String Bairro;
        public String Cidade;
        public String Estado;


    /**
     * @return the CEP
     */
    public int getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the Numero
     */
    public int getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Complemento
     */
    public String getComplemento() {
        return Complemento;
    }

    /**
     * @param Complemento the Complemento to set
     */
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public void Info2(String CEP, String Endereco, String Numero, String Compl, String Bairro1, String Cidade1, String Estado1){
        	this.CEP = Integer.parseInt(CEP);
		this.Endereco = Endereco;
                this.Numero = Integer.parseInt(Numero);
		this.Complemento = Compl;
		this.Bairro = Bairro1;
                this.Cidade = Cidade1;
                this.Estado = Estado1;   
    }
    
    //dados basicos
        public  String nome;
	public int cpf;
	public int telefone;
	public String endereco;
	public String email;
	public String sexo;
	public int dataNascimento;
	public String estadoCivil;
        
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataDeNascimento) {
		this.dataNascimento = dataDeNascimento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public void info(String nome, String cpf, String email, String telefone, String sexo, String dataN,String estadoC) {
		this.nome = nome;
		this.cpf = Integer.parseInt(cpf);
                this.email = email;
		this.telefone = Integer.parseInt(telefone);
		this.sexo = sexo;
                this.dataNascimento = Integer.parseInt(dataN);
                this.estadoCivil = estadoC;
	}
        
}
