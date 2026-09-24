class Solution {
    private void fuctionToReturn(int k, int n, int num,List<List<Integer>> ans,List<Integer> ds ){
        if(n == 0 && k == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = num; i<= 9;i++){
            if(i > n || k <= 0)  break;
            ds.add(i);
            fuctionToReturn(k-1, n-i, i+1, ans, ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        fuctionToReturn(k , n, 1, ans, new ArrayList<>());
        return ans;
    }
}