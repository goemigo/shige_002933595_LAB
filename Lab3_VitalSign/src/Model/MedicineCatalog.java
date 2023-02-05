/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class MedicineCatalog {
    ArrayList<Medicine> medicineList;
    
    public MedicineCatalog(){
        this.medicineList = new ArrayList<Medicine>();
        
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineCatalog(ArrayList<Medicine> medicineCatalog) {
        this.medicineList = medicineCatalog;
    }
    
    public Medicine createMedicine(String name, double dosage){
        Medicine medicine = new Medicine();
        
        medicine.setMedicineName(name);
        medicine.setDosage(dosage);
        
        this.medicineList.add(medicine);
        
        return medicine;
    }
    
    public void removeMedicine(String name){
        //find the medicine object with name
        for (Medicine m: medicineList){
            if(m.getMedicineName().equals(name)){
                this.medicineList.remove(m);
                break; 
            }
        }
    }
    
    public Boolean checkIfMedicineUnique(String name){
        for (Medicine m: medicineList){
            if (m.getMedicineName().equals(name)){
                return false;
            }
        }
        return true;
    }
    

}
