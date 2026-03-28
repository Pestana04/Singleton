package Test;

import Singleton.SistemaDelivery;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SistemaDeliveryTest {

    @Test
    public void deveRetornarNomeDelivery() {
        SistemaDelivery.getInstance().setNomeDelivery("MyFood Delivery");
        assertEquals("MyFood Delivery", SistemaDelivery.getInstance().getNomeDelivery());
    }

    @Test
    public void deveRetornarClientePedido() {
        SistemaDelivery.getInstance().setClientePedido("Gustavo");
        assertEquals("Gustavo", SistemaDelivery.getInstance().getClientePedido());
    }

    @Test
    public void deveRetornarItemPedido() {
        SistemaDelivery.getInstance().setItemPedido("Marmita de frango");
        assertEquals("Marmita de frango", SistemaDelivery.getInstance().getItemPedido());
    }

    @Test
    public void deveRetornarStatusPedido() {
        SistemaDelivery.getInstance().setStatusPedido("Em preparo");
        assertEquals("Em preparo", SistemaDelivery.getInstance().getStatusPedido());
    }
}