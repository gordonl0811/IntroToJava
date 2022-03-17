package exercises.solutions.ex010.employee;

public class ProductManager extends AbstractEmployee {

    private final int clients;

    public ProductManager(String id, int salary, int clients) {
        super(id, salary);
        this.clients = clients;
    }

    public int getClients() {
        return clients;
    }
    @Override
    public int calculateBonus() {
        return (int) (salary *  clients * 0.05);
    }
}
