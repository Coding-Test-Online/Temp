class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, start = 0, remaining = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            remaining += diff; 
            total += diff; 

            if (remaining < 0) { 
                remaining = 0;
                start = i + 1;
            }
        }
        return total >= 0 ? start : -1; 
    }
}