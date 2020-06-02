import org.junit.Assert;

public class Test {

    public int sum(int a, int b) {

        return a + b;

    }

    @org.junit.Test
    public void trst() {

        try {
            Assert.assertEquals(114, sum(5, 5));
            System.out.println("Test is successfull");
        } catch (Exception e) {
            System.out.println("Test is unsuccessfull");
        }
        System.out.println("Test completed!");

    }
}
