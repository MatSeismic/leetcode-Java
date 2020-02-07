/** 1323. Maximum 69 Number */

class Solution1323 {
    public int maximum69Number(int num) {
        String number = String.valueOf(num);
        char[] numbers = number.toCharArray();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == '6') {
                numbers[i] = '9';
                break;
            }
        }

        int result = Integer.valueOf(new String(numbers));
        return result;
    }
}