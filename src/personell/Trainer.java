package personell;

public class Trainer extends Employee implements Comparable<Trainer> {
    private String responsibility;

    public Trainer(String firstName, String lastName, String responsibility) {
        super(firstName, lastName);
        this.responsibility = responsibility;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public void signContract() {
        super.signContract(super.contractExpirationDate);
    }

    @Override
    public String toString() {
        return super.toString() + " - Trainer (" + responsibility + ")";
    }

    @Override
    public int compareTo(Trainer o) {
        if(this.responsibility.compareTo(o.responsibility) > 0) {
            return 1;
        } else if(this.responsibility.compareTo(o.responsibility) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
