package enumeration;

public enum Itens {
    AGUA(3), REFRIGERANTE(4), CERVEJA(5);

    public int valorItem;

    Itens(int valorUnitario){
        valorItem = valorUnitario;
    }
}
