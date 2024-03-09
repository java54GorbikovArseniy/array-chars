package telran.arrays;

public class ArrayChar {
    private char[] array;

    public ArrayChar(char[] array) {
        this.array = array;
    }

    public int compareTo(ArrayChar another) {
        int length = Math.min(array.length, another.array.length);
        int index = 0;
        while (index < length && array[index] == another.array[index]) {
            index++;
        }
        return index == length ? this.array.length - another.array.length : this.array[index] - another.array[index];
    }

    public int indexOf(char ch) {
        int index = 0;
        while (index < array.length && array[index] != ch) {
            index++;
        }
        return index == array.length ? -1 : index;
    }

    public int lastIndexOf(char ch) {
        int index = array.length - 1;
        while (index > -1 && array[index] != ch) {
            index--;
        }
        return index;
    }

    // 1.1. Int count(char character) returning count of the occurrences for a given character
    public int count(char ch) {
        int count = 0;
        for (char c : array) {
            if (c == ch)
                count++;
        }
        return count;
    }

//    1.2. Int compareToIgnporeCase(ArrayChar another) the same as the method compareTo but case-insensitive Hello == hElLo
    public int compareToIgnoreCase(ArrayChar arrayChar) {
        int length = Math.min(array.length, arrayChar.array.length);
        int index = 0;
        while (index < length) {
            char first = array[index];
            char second = arrayChar.array[index];

            if (first > 64 && first < 91) {
                first = (char) (first + 32);
            }
            if (second > 64 && second < 91) {
                second = (char) (second + 32);
            }

            if (first != second) {
                break;
            }

            index++;
        }
        return index == length ? this.array.length - arrayChar.array.length : this.array[index] - arrayChar.array[index];
    }

//    1.3. Boolean contains(char character) returning true an object of the class ArrayChar contains a given character
    public boolean contains(char ch) {
        boolean result = false;
        for (char c : array) {
            if (ch == c) {
                result = true;
                break;
            }
        }
        return result;
    }

//   1.4. Boolean equals(ArrayChar another) returning true if this object equals another one
    public boolean equals(ArrayChar arrayChar){

        return compareTo(arrayChar) == 0;
    }

//    1.5. Boolean equalsIgnoreCase((ArrayChar another) the same as the method equals but case-insensitive Hello == hElLo
    public boolean equalsIgnoreCase(ArrayChar arrayChar){

        return compareToIgnoreCase(arrayChar) == 0;
    }
}
