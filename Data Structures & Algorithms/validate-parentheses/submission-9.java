class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        

        for(int i = 0; i < s.length(); i++) {
            if(stack.empty() && (s.charAt(i) == ')' 
            || s.charAt(i) == ']' 
            || s.charAt(i) == '}')) 
                return false;
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.add(s.charAt(i));
            } else {
                if(s.charAt(i) == ')' && stack.peek() == '('){
                    stack.pop();
                } else if(s.charAt(i) == ']' && stack.peek() == '['){
                    stack.pop();
                } else if(s.charAt(i) == '}' && stack.peek() == '{'){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
