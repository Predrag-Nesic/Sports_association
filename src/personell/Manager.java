package personell;

public class Manager extends Employee {

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void signContract() {
        super.signContract(super.contractExpirationDate);
    }

    @Override
    public String toString() {
        return super.toString() + " - Manager";
    }
}
