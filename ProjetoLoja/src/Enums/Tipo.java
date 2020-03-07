
package Enums;

public enum Tipo {
    CA("Carreta"),
    CV("Cavalo"),
    FG("Frigorifico"),
    TR("Trator"),
    CG("Cargo");
    
    private String descricao;

    private Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
