#include <bits/stdc++.h>

using namespace std;

// Complete the repeatedString function below.
int main(){
    string s;
    cin >> s;
    long n;
    cin >> n;
    long count=0;
    int i,k=s.size();
    long p=n/k;
    
      for(i=0;i<s.size();i++){
        if(s[i]=='a')
            count++;
      }
    
    count = count * p;
    
    for(i=0;i<(n%s.size());i++){
        if(s[i]=='a')
            count++;
    } 
    cout << count << endl;
        return 0;
}