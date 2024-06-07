class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
return 0;
}

    s = s.trim();
    
    if (s.length() == 0) {
        return 0;
    }
    
    int index = 0;
    int sign = 1;
    int result = 0;
    int maxInt = Integer.MAX_VALUE;
    int minInt = Integer.MIN_VALUE;
    
    if (s.charAt(index) == '+') {
        sign = 1;
        index++;
    } else if (s.charAt(index) == '-') {
        sign = -1;
        index++;
    }
    
    while (index < s.length()) {
        char c = s.charAt(index);
        if (c < '0' || c > '9') {
            break;
        }
        
        int digit = c - '0';
        
        if (result > (maxInt - digit) / 10) {
            return (sign == 1) ? maxInt : minInt;
        }
        
        result = result * 10 + digit;
        index++;
    }
    
    return sign * result;
    }
}