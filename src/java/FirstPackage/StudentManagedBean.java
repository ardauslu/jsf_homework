/*
 * To change this license header, choose License Headers in Project Properties.
 * To change t/*
his template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstPackage;

/**
 *
 * @author ardau
 */

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
@ManagedBean


public class StudentManagedBean {
    
    private String firstName;
    private String lastName;
    private String country;
    
    List<String> countryOptions;    
    
    
    public StudentManagedBean() {
        
        countryOptions= new ArrayList<>();
        
        countryOptions.add("Brazil");
        countryOptions.add("France");
        countryOptions.add("Turkey");
        countryOptions.add("United States");
        countryOptions.add("United Kingdom");
        countryOptions.add("India");
        countryOptions.add("Germany");
    }

    public List<String> getCountryOptions() {
        return countryOptions;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
    
    
}

