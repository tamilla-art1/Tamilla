package bankabstract.entity;

public class Operation {
private int id;
private double amount;
public Operation(int id){
    this.id=id;
}

    public Operation(double amount,int id){
this.id=id;
        this.amount=amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
