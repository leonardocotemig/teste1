package org.example;

public class PessoaService {
    public String getInformacoes(Pessoa pessoa) {
        return "Nome: " + pessoa.getNome() + ", Endereço: " + pessoa.getEndereco() + ", Telefone: " + pessoa.getTelefone();
    }
}
