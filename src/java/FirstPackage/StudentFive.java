/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstPackage;

/**
 *
 * @author ardauslu
 */

import javax.faces.bean.ManagedBean;
@ManagedBean




public class StudentFive {
    
    private String firstName;
    private String lastName;
    private String favoriteLanguage;

    public StudentFive() {
    
    firstName="Arda";
    lastName="Uslu";
    favoriteLanguage="Java";
    
      
    
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
    
    
    
    
    
    
    
    
    
    
    
}
