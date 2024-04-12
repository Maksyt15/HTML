import java.util.ArrayList;
import java.util.List;

public class Bank<T extends BankAccount> {
    private List<T> accounts = new ArrayList<>();

    public Bank(List<T> accounts) {
        this.accounts = accounts;
    }

    public Bank() {
    }
}
