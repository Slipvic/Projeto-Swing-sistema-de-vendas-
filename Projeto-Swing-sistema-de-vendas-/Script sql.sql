create database farmacia;
use farmacia;

CREATE TABLE Cliente (
    Nome VARCHAR(10),
    Cpf int,
    Telefone int,
    Endereco VARCHAR(255),
    E_mail VARCHAR(255),
    Sexo VARCHAR(255),
    Data_de_Nascimento VARCHAR(8),
    Estado_Civil VARCHAR(255),
    Id int PRIMARY KEY auto_increment,
    Cep int,
    Numero int,
    Complemento VARCHAR(255),
    Bairro VARCHAR(255),
    Cidade VARCHAR(255),
    Estado VARCHAR(255),
    fk_Venda_Id int
);

CREATE TABLE Produto (
    Codigo int,
    Nome VARCHAR (255),
    Quantidade int,
    Valor_Compra int,
    Valor_Venda int,
    Fornecedor VARCHAR(255),
    id int PRIMARY KEY auto_increment
);

CREATE TABLE Vendedor (
    Nome VARCHAR(255),
    Usuario VARCHAR(255),
    Senha VARCHAR(255),
    Id int PRIMARY KEY auto_increment,
    E_mail VARCHAR(255),
    fk_Venda_Id int
);

CREATE TABLE Venda (
    Id int PRIMARY KEY auto_increment,
    Forma_De_Pagamento VARCHAR(255),
    Data_ Datetime
);

CREATE TABLE Relacionamento_2 (
    fk_Venda_Id int,
    fk_Produto_id int
);
 
ALTER TABLE Cliente ADD CONSTRAINT FK_Cliente_2
    FOREIGN KEY (fk_Venda_Id)
    REFERENCES Venda (Id)
    ON DELETE CASCADE;
 
ALTER TABLE Vendedor ADD CONSTRAINT FK_Vendedor_2
    FOREIGN KEY (fk_Venda_Id)
    REFERENCES Venda (Id)
    ON DELETE CASCADE;
 
ALTER TABLE Relacionamento_2 ADD CONSTRAINT FK_Relacionamento_2_1
    FOREIGN KEY (fk_Venda_Id)
    REFERENCES Venda (Id)
    ON DELETE RESTRICT;
 
ALTER TABLE Relacionamento_2 ADD CONSTRAINT FK_Relacionamento_2_2
    FOREIGN KEY (fk_Produto_id)
    REFERENCES Produto (id)
    ON DELETE SET NULL;