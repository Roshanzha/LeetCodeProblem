import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < req_skills.length; i++) {
            String s = req_skills[i];
            map.put(s, i);
        }

        int[] skills = new int[people.size()];
        for (int i = 0; i < people.size(); i++) {
            List<String> l = people.get(i);
            int count = 0;
            for (String str : l) {
                if (map.containsKey(str)) {
                    count |= (1 << map.get(str));
                }
            }
            skills[i] = count;
        }

        int n = req_skills.length;
        List<Integer>[] dp = new ArrayList[1 << n];
        dp[0] = new ArrayList<>();

        for (int i = 0; i < people.size(); i++) {
            int personSkills = skills[i];

            for (int j = 0; j < (1 << n); j++) {
                if (dp[j] == null) {
                    continue;
                }

                int newSkills = j | personSkills;
                if (dp[newSkills] == null || dp[j].size() + 1 < dp[newSkills].size()) {
                    List<Integer> newTeam = new ArrayList<>(dp[j]);
                    newTeam.add(i);
                    dp[newSkills] = newTeam;
                }
            }
        }

        List<Integer> team = dp[(1 << n) - 1]; 
        int[] result = new int[team.size()];
        for (int i = 0; i < team.size(); i++) {
            result[i] = team.get(i);
        }
        return result;
    }
}
