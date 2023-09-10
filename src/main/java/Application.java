public class Application {
    /**
     * This is a main method for manually testing your lab code.
     * No changes made here will affect test results.
     * @param args
     */
    public static void main(String[] args) {
        Lab lab = new Lab();
        System.out.println("Here is what your code returns as the id path param in https://revature.com/user/10:");
        int num = lab.parse("https://revature.com/user/10");
        System.out.println(num);
        System.out.println("It should be 10.");
    }
}
