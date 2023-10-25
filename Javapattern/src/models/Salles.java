package models;

public class Salles {
    private int id;
    private int numSalles;

    public Salles(int id, int numSalles) {
        this.id = id;
        this.numSalles = numSalles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumSalles() {
        return numSalles;
    }

    public void setNumSalles(int numSalles) {
        this.numSalles = numSalles;
    }

}
