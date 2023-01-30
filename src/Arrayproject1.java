/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author megha
 */
public class Arrayproject1 {
    public static void main(String[]args){
       
        
       
        int[] arraylist1={17,2,4,23,6};
        for( int i=0; i< arraylist1.length; i++){
            if(i%2==0)
            {
                arraylist1[i]=arraylist1[i]*2;
            }
            else{
                arraylist1[i]=arraylist1[i]*3;
            }
            System.out.println(arraylist1[i]);
      
    

    }
}
}
