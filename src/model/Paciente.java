
package model;

public class Paciente extends Pessoa {
    private String endereco;

    public Paciente(String nome, String cpf, String endereco) {
        super(nome, cpf);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Endereço: " + endereco);
    }
}
