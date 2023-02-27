package tech.edilbert.springdesk.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import tech.edilbert.springdesk.Enums.Perfil;

@Entity
public class Tecnico extends Pessoa {

    @OneToMany(mappedBy = "tecnico")
    private List<Chamado> chamados = new ArrayList<>();
    

    public Tecnico(Integer id, String nome, String email, String senha, String imagem, Perfil perfil,
            List<Chamado> chamados) {
        super(id, nome, email, senha, imagem, perfil);
        this.chamados = chamados;
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }    
    
}
