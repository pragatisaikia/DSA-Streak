

//Leetcode question no. 744 Easy : Find Smallest Letter Greater Than Target
public class smallest_letter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'c';
        char ans = nextGreatestLetter(arr,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
           
        }
        return letters[start % letters.length];

    }
}