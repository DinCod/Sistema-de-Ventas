package Modelo;

public class Cargo {

    private int id_cargo;
    private String cargo;
    
    public Cargo() {
        
    }

    public Cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }
    
    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
