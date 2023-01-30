/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;


/**
 *
 * @author emi
 */
public class ManipulateArray {
    
    public static void main(String[] args){
        
        int[] myarr = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("The original Array is: " +Arrays.toString(myarr));
        
        for(int i = 0; i < myarr.length; i++){
            if (i%2 == 0){
                myarr[i]=myarr[i]*2;
            }else{
                myarr[i]=myarr[i]*3;
            }
        }
        
        System.out.println("The new Array is: " + Arrays.toString(myarr));
    
    }
}
