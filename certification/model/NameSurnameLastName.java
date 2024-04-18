package model;

import java.util.Scanner;


public class NameSurnameLastName extends User {

    
    Scanner sc = new Scanner(System.in);
    public NameSurnameLastName (String NameSurnameLastName){
        sc.next(NameSurnameLastName);
    }
    

    @Override
    String NameSurnameLastName() {
        return null;
        
    }

    @Override
    String dateOfBirth() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dateOfBirth'");
    }

    @Override
    Integer phoneNumb() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'phoneNumb'");
    }

    @Override
    char sex() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sex'");
    }
    
    
    
}
