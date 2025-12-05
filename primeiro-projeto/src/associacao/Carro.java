package associacao;

public class Carro {
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Carro (int cilindtadas){
        this.motor = new Motor(cilindtadas);
    }

    public void mostraCilidrandas(){
        System.out.println(" O motor e de " + motor.getCilindradas() + " Cilindaradas");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}

