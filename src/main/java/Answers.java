public class Answers {
    //Warmup One
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    // if weekend and vacation are true return true and vice versa
}

//Warmup Two

public int diff21(int n) {
    if (n <= 21) {
        return 21 - n;
    } else {
        return (n - 21) * 2;
    }
}

// return difference if over 21 return double

//Warmup Three

public boolean nearHundred(int n) {
    return ((Math.abs(100 - n) <= 10) ||
            (Math.abs(200 - n) <= 10 ));
}

//Returns true/false if close too 100 or 200

//Warmup Four

public String missingChar(String str, int n) {
    String front = str.substring(0, n);
    String back = str.substring(n+1, str.length());
    return front + back;
}

//It is inputting a string and taking out a character

//Warmup Five

public String backAround(String str) {
    String last = str.substring(str.length() - 1);
    //takes the last character
    return last + str + last;
}

// String that takes the last inputted letter on the string and puts it at the front

//Warmup Six

public boolean startHi(String str) {

    if (str.length() < 2) return false;
    String firstTwo = str.substring(0, 2);
    //check first two
    if (firstTwo.equals("hi")) {
        //first two need to be hi
        return true;
    } else {
        return false;
    }
}

// checks if the string starts with "hi" by taking the first two letters of the string

//Warmup Seven

public boolean hasTeen(int a, int b, int c) {
    return (a>=13 && a<=19) ||
            (b>=13 && b<=19) ||
            (c>=13 && c<=19);
}

// A return statement using a range of 12 through 19 to check if the household has any teens and return true if they do

//Warmup eight

public boolean mixStart(String str) {
    if (str.length() < 3) return false;
    String two = str.substring(1, 3);
    if (two.equals("ix")) {
        return true;
    } else {
        return false;
    }
}

// checks if the string starts with "ix" by taking the next two letters of the string

