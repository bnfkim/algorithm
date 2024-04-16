import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int result = 0;
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<input.length(); i++) {
            //System.out.println("------------"+ i +"번째------------");
            if(input.charAt(i) == '(') {
                stack.push('(');
                continue;
            }
            if(input.charAt(i) == ')') {
                stack.pop();

                if(input.charAt(i-1) == '(') {
                    result += stack.size();
                } else {
                    result++;
                }
            }
            //System.out.println("result=" + result);
        }

        System.out.println(result);

    }
}