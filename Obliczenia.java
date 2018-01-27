package sample;

public class Obliczenia {
    private double temp;


    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    public void przeliczCnaF(double temp) {

        this.temp = (5.0/9.0)*temp+32;


    }
    public void przeliczCnaK(double temp) {

        this.temp=temp+273.15;


    }
    public void przeliczFnaC(double temp) {

        this.temp = 5.0/9.0*(temp-32);


    }
    public void przeliczFnaK(double temp) {

        this.temp = (5.0/9.0)*(temp-32)+273.15;


    }
    public void przeliczKnaC(double temp) {

        this.temp=temp-273.15;

        }
    public void przeliczKnaF(double temp) {

        this.temp = (9.0/5.0)*(temp-273.15)+32;


    }
}

