public abstract class PedidoDecorator implements Pedido {

    protected Pedido pedido;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract float getValorItem();

    public float getValor() {
        return this.pedido.getValor() + this.getValorItem();
    }
}
