
package service;

import model.Paciente;
import model.Medico;

import java.util.ArrayList;
import java.util.List;

public class CadastroService {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente cadastrado com sucesso.");
    }

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
        System.out.println("Médico cadastrado com sucesso.");
    }

    public void listarPacientes() {
        System.out.println("Lista de Pacientes:");
        for (Paciente paciente : pacientes) {
            paciente.exibirInfo();
        }
    }

    public void listarMedicos() {
        System.out.println("Lista de Médicos:");
        for (Medico medico : medicos) {
            medico.exibirInfo();
        }
    }
}
