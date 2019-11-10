import org.junit.Assert;
import org.junit.Test;

public class TestProjectMain {

    TestProject t1 = new TestProject();

    @Test
    public void returnSumTest1(){

       int rr =  t1.returnSum(3,5);

        Assert.assertTrue(rr==8);

    }

    @Test
    public void returnSumTest2(){

        int rr =  t1.returnSum(10,2);

        Assert.assertTrue(rr==12);

    }

    @Test
    public void returnMultiplyTest1(){

        int rr =  t1.multiply(5,2);

        Assert.assertTrue(rr==10);

    }

    @Test
    public void returnMultiplyTest2(){

        int rr =  t1.multiply(2,6);

        Assert.assertTrue(rr==12);

    }

    @Test
    public void returnMultiplyTest3(){

        int rr =  t1.multiply(10,0);

        Assert.assertTrue(rr==0);

    }

    @Test
    public void returnDivisionTest1(){

        int rr =  t1.devisionofTwoNumbers(10,2);

        Assert.assertTrue(rr==5);

    }

    @Test
    public void returnDivisionTes2(){

        int rr =  t1.devisionofTwoNumbers(20,2);

        Assert.assertTrue(rr==10);

    }

    @Test
    public void returnDivisionTes3(){

        int rr =  t1.devisionofTwoNumbers(100,5);

        Assert.assertTrue(rr==20);

    }


    @Test
    public void TotalLength1(){

        int rr =  t1.totalCharacter_ofString("States");

        Assert.assertTrue(rr==6);

    }

    @Test
    public void TotalLength2(){

        int rr =  t1.totalCharacter_ofString("United");

        Assert.assertTrue(rr==6);

    }

    @Test
    public void TotalLength3(){

        int rr =  t1.totalCharacter_ofString("America");

        Assert.assertTrue(rr==7);

    }
}
