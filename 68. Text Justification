class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int n = words.length;
        int i = 0;
        while (i < n) {
            int j = i + 1;
            int c = words[i].length();
            int wc = words[i].length();
            while (j < n && c + words[j].length() + 1 <= maxWidth) {
                c += words[j].length() + 1;
                wc += words[j].length();
                j++;
            }
            if (j == n || j - i == 1) {
                StringBuilder s = new StringBuilder();
                for (int p = i; p < j; p++) {
                    s.append(words[p]);
                    if (p != j - 1)
                        s.append(' ');
                }
                int ts = maxWidth - s.length();
                for (int k = 0; k < ts; k++) {
                    s.append(' ');
                }
                res.add(s.toString());
                i = j - 1;
            } else {
                int tw = j - i;
                int ts = maxWidth - wc;
                int es = ts / (tw - 1);
                int extra = ts % (tw - 1);
                StringBuilder s = new StringBuilder();
                for (int p = i; p < j; p++) {
                    s.append(words[p]);
                    if (extra > 0) {
                        s.append(' ');
                        extra--;
                    }
                    if (p != j - 1) {
                        for (int k = 0; k < es; k++) {
                            s.append(' ');
                        }
                    }
                }
                res.add(s.toString());
                i = j - 1;
            }
            i++;
        }
        return res;
    }
}
