package composicao;

import java.util.ArrayList;

public class Pedido {
	
	private int idPedido;
	private ArrayList<ItemPedido> itemPedido;
	public Pedido() {
		itemPedido = new ArrayList<ItemPedido>();
	}
	public void add(ItemPedido umPedido) {
		itemPedido.add(umPedido);
	}
}
