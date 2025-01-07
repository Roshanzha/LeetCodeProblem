class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res=new ArrayList<>();        
        int n=words.length;
        
        List<String>[] list=new List[31];
        for(int i=0; i<31; i++){
            list[i]=new ArrayList();
        }

        for(int i=0; i<n; i++){
            list[words[i].length()].add(words[i]);
        }

       
        for(int i=1; i<31; i++){
            if(list[i].size()==0) continue;
            for(String subStr:list[i]){
                
                int flag=0;
                for(int j=i+1; j<31; j++){
                    if(list[j].size()==0) continue;
                    for(String str:list[j]){

                        if(str.contains(subStr)){
                            res.add(subStr);
                            flag=1;
                            break;
                        }
                    }
                    if(flag==1) break;
                }
            }
        }

        return res;        
    }
}
