class Solution {
public:
    void dfs(int node,bool viz[],vector<int>v[]){
        if(viz[node]==1)
            return;
        viz[node]=1;
        for(auto u:v[node]){
            dfs(u, viz, v);
        }
    }
    int countComponents(int n, vector<vector<int>>& edges) {
        vector<int> v[n+5];
        for(auto edge:edges){
            // edge[0] a
            //edge[1] b
            v[edge[0]].push_back(edge[1]);
            v[edge[1]].push_back(edge[0]);
        }
        for(int i=0;i<n;i++){
            for(auto u:v[i]){
                cout<<u<<" ";
            }
            cout<<"\n";
        }
        int contor=0;
        bool viz[n+5];
        for(int i=0;i<n;i++){
            viz[i]=0;
        }
        for(int i=0;i<n;i++){
            if(viz[i]==0){
                dfs(i,viz,v);
                contor++;
            }
        }
        return contor;
    }
};

// 0: 1
// 1: 0 2
// 2: 1 3
// 4: 5
// 5: 4

// [[0,1], [1,2], [2,3], [4,5]]