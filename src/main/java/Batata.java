public class Batata extends PedidoDecorator {

    public Batata(Pedido curso) {
        super(curso);
    }

    public float getValorItem() {
        return 10.0f;
    }
}
