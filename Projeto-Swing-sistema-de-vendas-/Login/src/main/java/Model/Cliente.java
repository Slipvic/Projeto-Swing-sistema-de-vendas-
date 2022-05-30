package Model;

public class Cliente {
    
        //dados residenciais
        public int id;
		
	public String CEP;
        public String Endereco;
        public String Numero;
        public String Complemento;
        public String Bairro;
        public String Cidade;
        public String Estado;
        
        public String nome;
    	public String cpf;
    	public String telefone;
    	public String email;
    	
    	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
    	public String getEndereco() {
			return Endereco;
		}

		public void setEndereco(String endereco) {
			Endereco = endereco;
		}
		public String sexo;
    	public String dataNascimento;
    	public String estadoCivil;

    	public void Info2(String CEP, String Endereco, String Numero, String Compl, String Bairro1, String Cidade1, String Estado1){
        	this.CEP = CEP;
		this.Endereco = Endereco;
                this.Numero = Numero;
		this.Complemento = Compl;
		this.Bairro = Bairro1;
                this.Cidade = Cidade1;
                this.Estado = Estado1;   
    }
    public void info(String nome, String cpf, String email, String telefone, String sexo, String dataN,String estadoC) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.sexo = sexo;
		this.dataNascimento = dataN;
		this.estadoCivil = estadoC;
	}

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the Numero
     */
    public String getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(String Numero) {
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
    
    
    
        
        
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataDeNascimento) {
		this.dataNascimento = dataDeNascimento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
        
}
