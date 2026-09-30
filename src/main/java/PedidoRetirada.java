public class PedidoRetirada implements Pedido {

    public float valorBase;

    public PedidoRetirada() {
    }

    public PedidoRetirada(float valorBase) {
        this.valorBase = valorBase;
    }

    public float getValor() {
        return valorBase;
    }
}