#include<iostream>
#include<string>
using namespace std;
bool huiwen(int x){
	if(x<=0)
		return false;
	string s=to_string(x);
	int j=s.size()-1;
	int i=0;
	while(i<j){
		if(s[i]!=s[j]){
			return false;
		}
		j--;
		i++;
	}
	
	return true;
}
int main(){
	int x;
	cin>>x;
	cout<<boolalpha;
	cout<<huiwen(x)<<endl;
	
	
}
