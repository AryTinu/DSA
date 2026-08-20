class Solution {
    public int[] resultArray(int[] nums) {
    int n = nums.length;
    int[] arr1 = new int[n];
    int[] arr2 = new int[n];
    int l = 0;
    int r = 0;
    arr1[l++] = nums[0];
    arr2[r++] = nums[1]; 
    for(int i = 2 ; i < nums.length ; i++){
            if(arr1[l-1]>arr2[r-1]){
                arr1[l] = nums[i];
                l++;
            }else{
                arr2[r] = nums[i];
                r++;
            }
        }
        int[] nn = new int[n];
        int idx = 0;
    for(int i = 0 ; i < l ; i++){
            nn[idx++] = arr1[i];
        }
    for(int i = 0 ; i < r ; i++){
            nn[idx++] = arr2[i];
        }

        return nn;
    }
    
}