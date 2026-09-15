class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            if(c == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else {
                    return false;
                }
            }
            if(c == ']'){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                } else {
                    return false;
                }
            }
            if(c == '}'){
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
