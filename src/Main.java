public class Main {
    public static void main(LinearString[] args) {
        int[] nums = {18, 12,9,14,71,15};
        int val = 194;
        int ans = linearsearch(nums, val);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
            
        }
        for (int i = 0; i<arr.length; i++){
            int t = arr[i];
            if(t == target) {
                return i;
            }
        }
        return -1;
    }
}