class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> res;
        int idx1, idx2 = -1;
        for(int i = 0; i < nums.size(); i++) {
            for(int j = 0; j < nums.size(); j++) {
                if(i != j && (nums[i] + nums[j] == target)) {
                    if( i < j) {
                        idx1 = i;
                        idx2 = j;
                    }
                    else{
                        idx1 = j;
                        idx2 = i;
                    }
                    break;
                }
            }
        }
        res.push_back(idx1);
        res.push_back(idx2);
        return res;
    }
};
