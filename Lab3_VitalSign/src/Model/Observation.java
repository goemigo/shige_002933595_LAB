/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emi
 */
public class Observation {
    int observationId;
    double bloodPressure;
    double temperature;
    Medicine medication;
    
    public Observation(){
        this.medication = new Medicine();
    }

    public int getObservationId() {
        return observationId;
    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    //attach a medicine

    public Medicine getMedication() {
        return medication;
    }

    public void setMedication(Medicine medicine) {
        this.medication = medicine;
    }
    
    
    @Override
    public String toString(){
        return String.valueOf(this.observationId);
    }
    
}
