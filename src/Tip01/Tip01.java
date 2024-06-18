package Tip01;

public class Tip01 {
    public static void main(String[] args) {
        //Calculando total que cada convidado irá pagar 
        
       double tax = 0.05; //taxa:5%
       double tip = 0.15; //gorjeta;15%
        
        double person1 = 10;
        double total1 = person1*(1+ tax +tip);
        System.out.println(total1);
        
        double person2 = 12;
        double total2 = person2*(1+ tax +tip);
        System.out.println(total2);
        
        double person3 = 9;
        double total3 = person3*(1+ tax +tip);
        System.out.println(total3);
        
        double person4 = 8;
        double total4 = person4*(1+ tax +tip);
        System.out.println(total4);
        
        double person5 = 7;
        double total5 = person5*(1+ tax +tip);
        System.out.println(total5);
        
        double person6 = 15;
        double total6 = person6*(1+ tax +tip);
        System.out.println(total6);
        
        double person7 = 11;
        double total7 = person7*(1+ tax +tip);
        System.out.println(total7);
        
        double person8 = 30;
        double total8 = person8*(1+ tax +tip);
        System.out.println(total8);
        
        
        /*Total de cada convidado antes da taxa e da gorjeta:
        Pessoa 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
    }    
}
