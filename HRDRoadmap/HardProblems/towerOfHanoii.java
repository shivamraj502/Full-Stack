public class towerOfHanoii {

   public static void towerOfHanoi(int n, char A, char B, char C) {
    if(n == 1) {
        System.out.println("Move " + A + " to " + C);
        return;
    }
    
    if(n > 0) {
        towerOfHanoi(n-1, A, C, B);
        System.out.println("Move " + A + " to " + C);
        towerOfHanoi(n-1, B, A, C);
    }
}

    public static void main(String[] args) {
        int n = 3;                    // Change this number to test (try 2, 3, or 4)
        
        System.out.println("Tower of Hanoi with " + n + " disks:\n");
        
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}




// public class TowerofHanoi {
//     public static void hanoiTower(int n,char s,char a,char d){
//         if(n==1){
//             // System.out.println("Move disk 1 from " + s + " to " + d);
//             System.out.println(".");
//             return;
//         }

//         hanoiTower(n-1, s, d, a);
//         // System.out.println("Move disk " + n + " from " + s + " to " + d);
//         System.out.println("..");
//         hanoiTower(n-1, a, s, d);
//     }
//     public static void main(String[] args) {
//         int n=3;
//         char source='A';
//         char aux='B';
//         char des='C';
//         hanoiTower(n,source,aux,des);
//     }
// }
