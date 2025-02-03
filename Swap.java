// Swap s1,s2 values without using 3rd (String) variable.
class Swap{
    public static void main(String args[]){
        String s1 = "tree";
        String s2 = "flower";
        
        s1 = s1 + s2; // s1 = "tree" + "flower" → s1 = "treeflower"
s2 = s1.substring(0, s1.length() - s2.length()); 
// s2 = s1.substring(0, "treeflower".length() - "flower".length())
// s2 = s1.substring(0, 10 - 6) = s1.substring(0, 4) → s2 = "tree"

s1 = s1.substring(s2.length()); 
// s1 = s1.substring("tree".length())
// s1 = s1.substring(4) → s1 = "flower"

System.out.println("s1 : " + s1);
System.out.println("s2 : " + s2);
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       