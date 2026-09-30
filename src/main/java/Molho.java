public class Molho extends PedidoDecorator {

    public Molho(Pedido curso) {
        super(curso);
    }

    public float getValorItem() {
        return 3.0f;
    }
}
