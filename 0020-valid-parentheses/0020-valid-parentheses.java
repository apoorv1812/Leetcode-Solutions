class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);

    boolean changed = true;

    while(changed) {

        changed = false;

        for(int i = 0; i < sb.length() - 1; i++) {

            if((sb.charAt(i) == '(' && sb.charAt(i+1) == ')') ||
               (sb.charAt(i) == '{' && sb.charAt(i+1) == '}') ||
               (sb.charAt(i) == '[' && sb.charAt(i+1) == ']')) {

                sb.delete(i, i+2);
                changed = true;
                break;
            }
        }
    }

    return sb.length() == 0;
    }
}