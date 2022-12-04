package leetcode;
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total_gas = 0;
        int total_cost = 0;

        for(int i = 0; i < gas.length; i++){
            total_gas += gas[i];
            total_cost += cost[i];
        }

        if(total_gas < total_cost) return -1;

        int current_gas = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++){
            current_gas += gas[i];
            current_gas -= cost[i];

            if(current_gas < 0) {
                start = i + 1;
                current_gas = 0;
            }
        }
        return start;
    }
}
