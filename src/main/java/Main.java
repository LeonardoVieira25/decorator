
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Bebida(new Batata(new Batata(new Batata(new PedidoRetirada(10.0f)))));

        System.out.println(pedido.getValor());
    }
}
