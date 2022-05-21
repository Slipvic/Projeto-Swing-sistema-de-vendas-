package Classes;

public class Dados {
        String nome;
	String cpf;
	String telefone;
	String endereco;
	String email;
	String sexo;
	String dataNascimento;
	String estadoCivil;

        
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
	public void Dados(String nome, String cpf, String email, String telefone, String sexo, String dataN,String estadoC) {
		this.nome = nome;
		this.cpf = cpf;
                this.email = email;
		this.telefone = telefone;
		this.sexo = sexo;
                this.dataNascimento = dataN;
                this.estadoCivil = estadoC;
	}
        
}
