package personell;

import java.time.LocalDate;

public class Employee extends Person {
    protected LocalDate dateOfSigning;
    protected LocalDate contractExpirationDate;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        dateOfSigning = LocalDate.now();
        // contractExpirationDate = LocalDate.of(2022, 12, 30);
    }

    public LocalDate getDateOfSigning() {
        return dateOfSigning;
    }

    public LocalDate getContractExpirationDate() {
        return contractExpirationDate;
    }

    public void signContract(LocalDate contractExpirationDate) {
        this.dateOfSigning = LocalDate.now();
        this.contractExpirationDate = contractExpirationDate;
    }


}
