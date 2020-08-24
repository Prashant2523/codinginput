
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> fin = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        for(int i = 0; i<numRows; i++){
            fin.add(new ArrayList<>(temp));
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for(int j = 0; j<temp.size()-1; j++){
                newList.add(temp.get(j)+temp.get(j+1));
            }
            newList.add(1);
            temp = new ArrayList<>(newList);
        }
        return fin;
    }
}
