package model.bo;

import java.util.ArrayList;

public class ClasseDadosGravacao {

    private static ClasseDadosGravacao uniqueinstance;
    
    public static ArrayList<Medicamento> listaMedicamento = new ArrayList<>();
    public static ArrayList<Laboratorio> listaLaboratorio = new ArrayList<>();
    public static ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public static ArrayList<Enfermeiro> listaEnfermeiros = new ArrayList<>();
    public static ArrayList<Medico> listaMedicos = new ArrayList<>();
    public static ArrayList<Farmaceutico> listaFarmaceuticos = new ArrayList<>();
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public static ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
    public static ArrayList<Ala> listaAlas = new ArrayList<>();

    private ClasseDadosGravacao() {
    }

    public static synchronized ClasseDadosGravacao getInstance() {

        if (uniqueinstance == null) {
            uniqueinstance = new ClasseDadosGravacao();
        }

        return uniqueinstance;
    }

}
