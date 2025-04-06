public class BlockTest {

    static
    {
        System.out.println("Inside static block");
    }
    {
        System.out.println("Inside instance block");
    }
    public BlockTest() {
        System.out.println("Inside Constructor");
    }

    public static void main(String[] args) {
        BlockTest test1 = new BlockTest();
        BlockTest test2 = new BlockTest();
    }

}
