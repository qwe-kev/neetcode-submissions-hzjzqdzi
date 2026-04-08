#include <unordered_map>
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int, int> map;
        bool flag = false;
        for(int num : nums) {
            if(map.find(num) == map.end()) {
                map[num] = 1;
            }
            else{
                flag = true;
                break;
            }
        }
        return flag;
    }
};