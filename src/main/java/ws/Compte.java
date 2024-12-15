package ws;

import java.util.Date;
// Java Bean
public class Compte {
    private int code;
    private double solde;
    private Date dateCration;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCration() {
        return dateCration;
    }

    public void setDateCration(Date dateCration) {
        this.dateCration = dateCration;
    }

    public Compte(int code, double solde, Date dateCration) {
        this.code = code;
        this.solde = solde;
        this.dateCration = dateCration;
    }

    public Compte() {
    }
}
