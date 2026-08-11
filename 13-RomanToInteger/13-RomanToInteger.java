// Last updated: 11/08/2026, 16:07:29
class Solution {
    public int romanToInt(String s) {
        int num = 0;
    int lastProcessed = -1;
    for (int i = 0; i < s.length() - 1; i++) {
        char a = s.charAt(i);
        char b = s.charAt(i + 1);
        if (a == 'I') {
            if (b == 'V') {
                num += 4;
                i++;
                lastProcessed = i;
            } else if (b == 'X') {
                num += 9;
                i++;
                lastProcessed = i;
            } else {
                num += 1;
            }
        } else if (a == 'X') {
            if (b == 'L') {
                num += 40;
                i++;
                lastProcessed = i;
            } else if (b == 'C') {
                num += 90;
                i++;
                lastProcessed = i;
            } else {
                num += 10;
            }
        } else if (a == 'C') {
            if (b == 'D') {
                num += 400;
                i++;
                lastProcessed = i;
            } else if (b == 'M') {
                num += 900;
                i++;
                lastProcessed = i;
            } else {
                num += 100;
            }
        } else if (a == 'V') {
            num += 5;
        } else if (a == 'L') {
            num += 50;
        } else if (a == 'D') {
            num += 500;
        } else if (a == 'M') {
            num += 1000;
        }
    }
    if (lastProcessed != s.length() - 1) {
        char last = s.charAt(s.length() - 1);

        if (last == 'I') {
            num += 1;
        } else if (last == 'V') {
            num += 5;
        } else if (last == 'X') {
            num += 10;
        } else if (last == 'L') {
            num += 50;
        } else if (last == 'C') {
            num += 100;
        } else if (last == 'D') {
            num += 500;
        } else if (last == 'M') {
            num += 1000;
        }
    }

    return num;
    }
}