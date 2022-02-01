package TestNG;

import org.testng.annotations.Test;

public class Groups_in_Groups {
        @Test(groups= {"Smoke"})
        public void Atest1()
        {
            System.out.println("test1");
        }
        @Test(groups= {"Regression"})
        public void Btest2()
        {
            System.out.println("test2");
        }
        @Test(groups= {"Sanity"})
        public void Atest3()
        {
            System.out.println("test3");
        }
}
