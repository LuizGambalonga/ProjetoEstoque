
package Enums;

public enum Tipo {
    VA("Varejo"),
    AT("Atacado"),
    VR("Variados"),
    EX("Exclusivo"),
    UC("Unico");
    
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
