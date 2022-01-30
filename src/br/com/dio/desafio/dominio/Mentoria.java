package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;
    

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    
    
    public Mentoria() {
    }
    
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    
    
    
        @Override
        public String toString() {
            return "Mentoria [data=" + data + ", descricao=" + getDescricao() + ", titulo=" + getTitulo() + "]";
        }
    
}
