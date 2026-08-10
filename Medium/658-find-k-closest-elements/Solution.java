class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Queue <Integer> ans = new LinkedList<>();
        List <Integer> result = new ArrayList<>();
        
        ans.add(arr[0]);

        for(int i = 1 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                if((arr[i]-x)<(arr[j]-x)){
                    ans.add(arr[i]);
                }else if(((arr[i]-x)<(arr[j]-x)) && i < j){
                    ans.add(arr[i]);
                }else{
                    continue;
                }
            }
        }

        for(int i = 0 ; i<ans.size();i++){
            result.add(ans.poll());
        }

        return result;
    }
}