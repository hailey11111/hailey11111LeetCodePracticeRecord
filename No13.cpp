#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;
//建立 哈希表
class Solution {
public:
	int romanToInt(string s) {
		unordered_map<char, int> romanMap = {
			{'I', 1},
			{'V', 5},
			{'X', 10},
			{'L', 50},
			{'C', 100},
			{'D', 500},
			{'M', 1000}
		};
		int res = 0;
		int len = s.size();
		for (int i = 0; i < len - 1; ++i) {
			int cur = romanMap[s[i]];
			int next = romanMap[s[i + 1]];
			if (cur < next) {
				res -= cur;
			} else {
				res += cur;
			}
		}
		// 加上最后一位
		res += romanMap[s.back()];
		return res;
	}
};


int main() {
	Solution sol;
	cout << sol.romanToInt("III") << endl;      // 3
	cout << sol.romanToInt("IV") << endl;       // 4
	cout << sol.romanToInt("IX") << endl;       // 9
	cout << sol.romanToInt("LVIII") << endl;    // 58
	cout << sol.romanToInt("MCMXCIV") << endl;  // 1994
	return 0;
}
