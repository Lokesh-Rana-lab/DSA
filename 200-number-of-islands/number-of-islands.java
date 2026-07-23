class Solution {
    void dfs(int rw, int cl,int [][] vis,char[][] grd){
        int n = grd.length, m=grd[0].length;
        vis[rw][cl]=1;
        if((rw+1)<n && grd[rw+1][cl]=='1' && vis[rw+1][cl]==0) dfs(rw+1,cl,vis,grd);
        if((rw-1)>=0 && grd[rw-1][cl]=='1' && vis[rw-1][cl]==0) dfs(rw-1,cl,vis,grd);
        if((cl+1)<m && grd[rw][cl+1]=='1' && vis[rw][cl+1]==0) dfs(rw,cl+1,vis,grd);
        if((cl-1)>=0 && grd[rw][cl-1]=='1' && vis[rw][cl-1]==0) dfs(rw,cl-1,vis,grd); 
        
          }
    public int numIslands(char[][] grd) {
        int n = grd.length, m=grd[0].length;
        int [][] vis = new int[n][m];
        int cnt = 0;
        for(int i=0;i<n ;i++){
            for(int j =0;j<m;j++){
                if(grd[i][j]=='1'  && vis[i][j]==0){
                    dfs(i,j,vis,grd);
                    cnt++;
                }
            }
        }  
        return cnt;      
    }
}