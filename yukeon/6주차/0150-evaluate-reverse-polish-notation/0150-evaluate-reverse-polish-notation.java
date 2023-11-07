class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int ans = 0;

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());

                if (s.equals("+")) stack.push(String.valueOf(n1 + n2));
                else if (s.equals("-")) stack.push(String.valueOf(n2 - n1));
                else if (s.equals("*")) stack.push(String.valueOf(n1 * n2));
                else stack.push(String.valueOf(n2 / n1));
            }
            else stack.push(s);
        }
        return Integer.parseInt(stack.peek());
    }
}