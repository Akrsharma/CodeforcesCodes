#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,W;
        cin>>n>>W;
        vector<int> w(n);
        for(int i=0; i<n; i++)
        {
            cin>>w[i];
        }        
        sort(w.begin(), w.end());
        int sum = 0;
        int height = 0;
        vector<int>::iterator it1;
        while(!w.empty())
        {
            sum = 0;
            n = w.size();
            for(int i=n-1; i>=0; i--)
            {
                sum += w[i];
                if(sum > W)
                {
                    sum -= w[i];
                    continue;
                }
                else
                {

                    it1 = w.begin() + i;
                    w.erase(it1);
                }
                
            }
            height++;
        }
        cout<<height<<endl;
    }
    return 0;
}