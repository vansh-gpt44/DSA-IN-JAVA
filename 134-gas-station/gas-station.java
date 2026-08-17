//    it will run in some test case but no all test cases
// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int min_cost=cost[0];
//         int idx=0;
//         for(int i=1;i<=cost.length-1;i++){
//             if(min_cost>=cost[i]){
//                 min_cost=cost[i];
//                 idx=i;
//             }
//         }
//         int str_gas=0,tank=0;
//         for(int i=0;i<gas.length;i++){
//             if(idx==i){
//                 str_gas=gas[i];
//             }
//         }
//         tank=str_gas+0;
//         for(int i=0;i<cost.length;i++){
//             if(idx==cost.length){
//                 idx=0;
//             }
//             else{
//                 if(idx+1>=cost.length){
//                     idx=0;
//             }
//                 else{
//                     tank=(tank-cost[idx])+gas[idx+1];
//                     idx++;  
//                 }
//             }
//         }
//         for(int i=0;i<cost.length;i++){
//             if(tank==cost[i]){
//                 return gas[i];
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = 0; 
        int tank = 0;    
        int start = 0;   
        for (int i = 0; i < n; i++) {
            total += gas[i] - cost[i];
            tank += gas[i] - cost[i]; 
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        if (total < 0) return -1;
        return start;
    }
}
