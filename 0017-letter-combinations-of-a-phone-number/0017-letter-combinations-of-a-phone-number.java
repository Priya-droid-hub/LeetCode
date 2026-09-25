class Solution {
    private void solve(String digits, String output, int index, List<String> ans, String[] mapping){

        if(index >= digits.length()){
            ans.add(output);
            return;
        }

        int number = digits.charAt(index) - '0';
        String value = mapping[number];

        for(int i = 0; i< value.length();i++){
            output = output + value.charAt(i);
            solve(digits, output, index+1, ans, mapping);
            output = output.substring(0, output.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }

        String output = "";
        String[] mapping = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        solve(digits, output, 0, ans, mapping);
        return ans;
    }
}