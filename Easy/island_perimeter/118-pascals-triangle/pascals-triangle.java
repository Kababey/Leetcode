class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(); // Fixed initialization

        // Each row starts with 1 and ends with 1

        // Create first row
        List<Integer> first = new ArrayList<>(); // Fixed initialization
        first.add(1);
        result.add(first);

        if (numRows == 1)
            return result;

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
  
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j - 2));
                }
            }
          
            result.add(row);
        }
        result.remove(0);
        return result;
    }



}