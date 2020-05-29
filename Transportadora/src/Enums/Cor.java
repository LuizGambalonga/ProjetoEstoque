
package Enums;

public enum Cor{
    AZ("AZUL"),
    BC("BRANCO"),
    VR("VERDE"),
    AM("AMARELO"),
    VE("VERMELHO"),
    RS("ROSA"),
    RX("ROXO"),
    CZ("CINZA"),
    PT("PRETO"),
    MR("MARROM"),
    LL("LILAS"),
    LA("LARANJA"),
    CP("COR DE PELE");
   
    
    private String descricao;

    private Cor(String descricao) {
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
