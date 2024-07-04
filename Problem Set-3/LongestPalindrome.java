package in.set3;

public class LongestPalindrome {

	public static void main(String[] args) {
		String[] arr = {"madam", "racecar", "apple", "banana", "level"};

        String longestPalindrome = "";
        for (String str : arr) {
            if (isPalindrome(str) && str.length() > longestPalindrome.length()) {
                longestPalindrome = str;
            }
        }

        if (longestPalindrome.isEmpty()) {
            System.out.println("No palindrome found.");
        } else {
            System.out.println("The longest palindrome is: " + longestPalindrome);
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
	}

}
