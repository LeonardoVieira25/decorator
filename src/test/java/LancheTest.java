
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LancheTest {

    @Test
    void deveRetornarValorDoPedido() {
        Pedido pedido = new PedidoRetirada(10.0f);
        assertEquals(10.0f, pedido.getValor());
    }

    @Test
    void deveRetornarValorDoPedidoComBatata() {
        Pedido pedido = new Batata(new PedidoRetirada(10.0f));
        assertEquals(20.0f, pedido.getValor());
    }

    @Test
    void deveRetornarValorDoPedidoComBebida() {
        Pedido pedido = new Bebida(new PedidoRetirada(10.0f));
        assertEquals(15.0f, pedido.getValor());
    }

    @Test
    void deveRetornarCargaHorariaCursoComTrabalhoConclusaoCurso() {
        Pedido pedido = new Molho(new PedidoRetirada(10.0f));
        assertEquals(13.0f, pedido.getValor());
    }

    @Test
    void deveRetornarCargaHorariaCursoComEstagioMaisAtividadesComplementares() {
        Pedido pedido = new Batata(new Bebida(new PedidoRetirada(10.0f)));
        assertEquals(25.0f, pedido.getValor());
    }

    @Test
    void deveRetornarCargaHorariaCursoComEstagioMaisTrabalhoConclusaoCurso() {
        Pedido pedido = new Batata(new Molho(new PedidoRetirada(10.0f)));
        assertEquals(23.0f, pedido.getValor());
    }

    @Test
    void deveRetornarCargaHorariaCursoComAtividadesComplementaresMaisTrabalhoConclusaoCurso() {
        Pedido pedido = new Bebida(new Molho(new PedidoRetirada(10.0f)));
        assertEquals(18.0f, pedido.getValor());
    }

    @Test
    void deveRetornarCargaHorariaCursoComEstagioMaisAtividadesComplementaresMaisTrabalhoConclusaoCurso() {
        Pedido pedido = new Batata(new Bebida(new Molho(new PedidoRetirada(10.0f))));

        assertEquals(28.0f, pedido.getValor());
    }
}