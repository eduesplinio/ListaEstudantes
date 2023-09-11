package Estudande;

import java.util.ArrayList;

public class ControladorEstudante {
    private ArrayList<Estudante> estudantes;

    public ControladorEstudante() {
        estudantes = new ArrayList<Estudante>();
    }

    public void incluirEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void excluirEstudante(Estudante estudante) {
        estudantes.remove(estudante);
    }

    public localizarEstudantePorNome(String nome) {
        Estudante estudante = null;
        for (int i = 0; i < estudantes.size(); i++) {
            if (estudantes.get(i).obterNome().equals(nome)) {
                estudante = estudantes.get(i);
                break;
            }
        }
        return estudante;
    }

    public ArrayList<Estudante> obterEstudantes() {
        return estudantes;
    }
}