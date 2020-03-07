package Enums;

public enum StatusItem {
    E("Estoque"),
    S("Sem Estoque");
    
    private String descricao;

    private StatusItem(String descricao) {
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
