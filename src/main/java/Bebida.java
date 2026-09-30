
public class Bebida extends PedidoDecorator {

    public Bebida(Pedido pedido) {
        super(pedido);
    }

    public float getValorItem() {
        return 5.0f;
    }
}
