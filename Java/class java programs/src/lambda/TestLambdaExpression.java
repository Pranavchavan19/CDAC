package lambda;

@FunctionalInterface
interface LengthFinder {

    int strlength(String str);
}

public class TestLambdaExpression {

    public static void main(String[] args) {
        LengthFinder lf = (str) -> str.length();
//				lf.strlength("Kshitij");
        System.out.println("Length of given string is : " + lf.strlength("pranav"));
    }

}
