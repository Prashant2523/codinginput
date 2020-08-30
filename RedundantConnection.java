class Solution {

int[] parent;
int[] rank;

public int[] findRedundantConnection(int[][] edges) {
    
    parent = new int[edges.length+1];
	rank = new int[edges.length+1];

	for (int i = 0; i < parent.length; i++)
		parent[i] = i;
    
    for(int[] edge:edges){
        
        int x = edge[0];
        int y = edge[1];
        
        int parentx = find(x);
        int parenty = find(y);
        
        if(parentx!=parenty){
            union(x,y);
            continue;
        }
        return edge;
    }
    
    return null;
}

public int find(int x) {

	if (parent[x] == x)
		return x;

	int temp = find(parent[x]);
	parent[x] = temp; 
	return temp;
}

public void union(int x, int y) {

	int parentx = find(x);
	int parenty = find(y);

	if (parentx == parenty)
		return;

	int rankx = rank[parentx];
	int ranky = rank[parenty];

	if (rankx < ranky)
		parent[parentx] = parenty;
	else if (rankx > ranky)
		parent[parenty] = parentx;
	else {
		parent[parentx] = parenty;
		rank[parenty]++;
	}

}

}
