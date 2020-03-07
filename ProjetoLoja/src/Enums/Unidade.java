
package Enums;

public enum Unidade{
    UN("UNIDADE"),
    CX("CAIXA"),
    PC("PEÇA"),
    PT("PACOTE"),
    LT("LITRO"),
    PAR("PAR"),
    MT("METRO"),
    KG("KILO"),
    CM("CENTIMETRO"),
    MM("MILIMETRO"),
    BD("BALDE"),
    OL("OLEO");
   
    
    private String descricao;

    private Unidade(String descricao) {
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
