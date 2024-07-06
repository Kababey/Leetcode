class Solution {
public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();

    // Start generating rows from the second row
    for (int i = 0; i < numRows; i++) {
        List<Integer> row = new ArrayList<>();
        // Each row starts with 1
        row.add(1);

        // Generate elements between the first and last 1
        for (int j = 1; j < i; j++) {
            int sum = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
            row.add(sum);
        }

        // End each row with 1
        if (i > 0) {
            row.add(1);
        }

        result.add(row);
    }

    return result;
}

}