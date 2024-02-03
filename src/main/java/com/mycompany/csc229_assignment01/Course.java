/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
    
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID, String Name, String Code) {
        this.ID = ID;
        this.Name = Name;
        this.Code = Code;
    }

    private String name;
    private String code;

}
public String getName()
    return Name;
}

public void setName(String Name) {
    this.Name = Name;
}

public String getCode() {
  return Code;
}

public void setCode(String Code) {
    this.Code = Code;
   }
}

public class Driver {
    public static void main(String[] args) {
        Course course = new Course(25110,"Moaath","CSC229");
        course.setID(2);
        course.setName("Moaath");
        course.setCode("CSC229");
        System.out.println("ID: "+course.getID());
        System.out.println("Name: "+course.getName());
        System.out.println("Code: "+course.getCode());

    }
}
