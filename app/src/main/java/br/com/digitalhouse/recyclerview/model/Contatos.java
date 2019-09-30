package br.com.digitalhouse.recyclerview.model;

public class Contatos {

    private String nome;
    private String telefone;
    private String status;


    public Contatos(String nome, String telefone, String status) {
        this.nome = nome;
        this.telefone = telefone;
        this.status = status;
    }

    public Contatos() {
    }

    public Contatos(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}