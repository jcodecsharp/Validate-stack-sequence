import stackvalidation.mypackage.Solution;

public class Main {
    public static void main(String[] args) {
        int [] pushed = {1,2,3,4,5};
        int [] popped = {5,3,4,2,1};
        Solution solution = new Solution();

        System.out.println(solution.validateStackSequences(pushed,popped));
    }
}