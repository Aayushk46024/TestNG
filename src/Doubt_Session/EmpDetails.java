package Doubt_Session;

public interface EmpDetails {
    void perdetails();
    void ExpDetails();
    static void demo()
    {
        System.out.println("Static Mehtod of an Interface");;
    }
    default void defMethod()
    {
        System.out.println("Default Method of an Interface");
    }

}
