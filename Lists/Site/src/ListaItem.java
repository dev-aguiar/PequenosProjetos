import java.util.ArrayList;
import java.util.List;

public class ListaItem {

    private List<Item> itemList;

    public ListaItem() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item rItem : itensParaRemover) {
            if (rItem.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(rItem);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        ListaItem listaItem = new ListaItem();

        listaItem.adicionarItem("Produto 1", 23d, 2);
        listaItem.adicionarItem("Produto 2", 25d, 1);

        listaItem.exibirItens();
        System.out.println("O valor total é " + listaItem.calcularValorTotal());
    }
}