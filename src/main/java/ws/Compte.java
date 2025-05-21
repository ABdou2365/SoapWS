package ws;

import java.util.Date;

public class Compte {

    private int code;
    private double salaire;
    private Date date;

    public Compte() {
    }

    public Compte(int code, double salaire, Date date) {
        this.code = code;
        this.salaire = salaire;
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
