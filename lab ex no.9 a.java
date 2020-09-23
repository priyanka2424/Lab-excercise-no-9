/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


public class Manager {
    public static void main(String[] args)
    {
        Manager obj=new Manager();
        try
        {
            obj.checkmanager();
        }
        catch(RoleNotApplicableException e)
        {
            System.out.println("exception:"+e);
        }
    }
    void checkmanager() throws RoleNotApplicableException
    {
        
        String name="Maya";
        int age=30;
        String qualification="M.Sc";
        int experience=8;
        System.out.println("Name:"+name+"\t age:"+age+"\t qualification:"+qualification+"\t experience:"+experience);
        
        if(qualification!="M.B.A" && experience<10)
             throw new RoleNotApplicableException("Qualification is not M.B.A and experience is not more than 10 ! ! ");
             
             System.out.println("Qualifiction:"+qualification+"\t Experience:"+experience);
       
    }
}
class RoleNotApplicableException extends Exception
{
    String message;
    RoleNotApplicableException(String m)
    {
        message=m;
    }

    @Override
    public String toString() {
        return message ;
    }
    
    
            
}
