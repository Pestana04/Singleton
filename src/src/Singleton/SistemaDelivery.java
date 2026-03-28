package Singleton;

public class SistemaDelivery {

    private SistemaDelivery() {};
    private static SistemaDelivery instance = new SistemaDelivery();

    public static SistemaDelivery getInstance() {
        return instance;
    }

    private String nomeDelivery;
    private String clientePedido;
    private String itemPedido;
    private String statusPedido;

    public String getNomeDelivery() {
        return nomeDelivery;
    }

    public void setNomeDelivery(String nomeDelivery) {
        this.nomeDelivery = nomeDelivery;
    }

    public String getClientePedido() {
        return clientePedido;
    }

    public void setClientePedido(String clientePedido) {
        this.clientePedido = clientePedido;
    }

    public String getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(String itemPedido) {
        this.itemPedido = itemPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }
}