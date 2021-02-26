package personell;

public class Player extends Employee implements Comparable<Player> {
    private String position;

    public Player(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void signContract() {
        super.signContract(super.contractExpirationDate);
    }

    @Override
    public String toString() {
        return super.toString() + " - Player (" + position + ")" ;
    }


    @Override
    public int compareTo(Player o) {
        if(this.position.compareTo(o.position) > 0) {
            return 1;
        } else if(this.position.compareTo(o.position) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
