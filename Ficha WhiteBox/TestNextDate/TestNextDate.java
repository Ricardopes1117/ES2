



import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import whitebox.NextDate;
 public class TestNextDate {


     @Test
     public void ECP1() {
         NextDate date = new NextDate(1, 2, 2018);
         assertEquals("1/3/2018", date.run(1, 2, 2018));
     }

     @Test
     public void ECP2() {
         NextDate date = new NextDate(2, 3, 2018);
         assertEquals("2/4/2018", date.run(2, 3, 2018));
     }

     @Test
     public void ECP3() {
         NextDate date = new NextDate(3, 31, 1999);
         assertEquals("4/1/1999", date.run(3, 31, 1999));
     }

     @Test
     public void ECP4() {
         NextDate date = new NextDate(12, 31, 2021);
         assertEquals("Invalid Next Year", date.run(12, 31, 2021));
     }

     @Test
     public void ECP5() {
         NextDate date = new NextDate(3, 32, 2000);
         assertEquals("invalid Input Date", date.run(3, 32, 2000));
     }


     @Test
     public void ECP6() {
         NextDate date = new NextDate(12, 31, 2020);
         assertEquals("1/1/2021", date.run(12, 31, 2020));
     }
     @Test
     public void ECP7() {
         NextDate date = new NextDate(4, 30, 2019);
         assertEquals("5/1/2019", date.run(4, 30, 2019));
     }
     @Test
     public void ECP8() {
         NextDate date = new NextDate(4, 31, 2000);
         assertEquals("Invalid Input Date", date.run(4, 31, 2000));
     }
     @Test
     public void ECP9() {
         NextDate date = new NextDate(4, 15, 2010);
         assertEquals("4/16/2010", date.run(4, 15, 2010));
     }
     @Test
     public void ECP10() {
         NextDate date = new NextDate(12, 20, 2020);
         assertEquals("12/21/2020", date.run(12, 20, 2020));
     }
     @Test
     public void ECP11() {
         NextDate date = new NextDate(2, 25, 2000);
         assertEquals("2/26/2000", date.run(2, 25, 2000));
     }
     @Test
     public void ECP12() {
         NextDate date = new NextDate(2, 29, 2021);
         assertEquals("Invalid Input Date", date.run(2, 29, 2021));
     }

     @Test
     public void ECP13() {
         NextDate date = new NextDate(2, 28, 2021);
         assertEquals("3/1/2021", date.run(2, 28, 2021));
     }
     @Test
     public void ECP14() {
         NextDate date = new NextDate(2, 28, 2020);
         assertEquals("2/29/2020", date.run(2, 28, 2020));
     }
     @Test
     public void ECP15() {
         NextDate date = new NextDate(2, 31, 2000);
         assertEquals("Invalid Input Date", date.run(2, 31, 2000));
     }
     @Test
     public void ECP16() {
         NextDate date = new NextDate(2, 29, 2020);
         assertEquals("3/1/2020", date.run(2, 29, 2020));
     }
 }