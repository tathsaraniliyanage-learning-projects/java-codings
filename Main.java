// Swap x,y values without using 3rd variable.
class Main{
    public static void main(String args[]){
        int x = 10;
        int y = 20;

            // Swap using arithmetic operations
            x = x + y;  // x becomes 30
            y = x - y;  // y becomes 10 (30 - 20)
            x = x - y;  // x becomes 20 (30 - 10)
    
            System.out.println("x = " + x);  // Output: x = 20
            System.out.println("y = " + y);  // Output: y = 10
    }
}
