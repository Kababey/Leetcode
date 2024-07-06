class Solution {
        public int lastStoneWeight(int[] stones) {
            List<Integer> list = Arrays.stream(stones).boxed().collect(Collectors.toList());

            while (list.size() > 1) {
                list.sort((a, b) -> b - a);
                int y = list.remove(0);
                int x = list.remove(0);
                if (x != y) {
                    list.add(y - x);
                }
            }

            return list.isEmpty() ? 0 : list.get(0);
            
        }
    
        
    }