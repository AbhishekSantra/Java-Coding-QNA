//Shuffle String

class leetcode1528 {
    public String restoreString(String s, int[] indices) {
        char char1;
        String temp=s,dummy=s;
        for(int i=0;i<dummy.length();i++){
            char1=temp.charAt(i);
            if(indices[i]+1 == dummy.length()){
                s=dummy.substring(0,indices[i])+char1;
                dummy=s;
            }
            else{
                s=dummy.substring(0,indices[i])+char1+dummy.substring(indices[i]+1);
                dummy=s;
            }
        }
        return s;
    }
}
