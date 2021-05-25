
public class Main {

    public static void main(String[] args) {

//Hash insert--------------------------------------------------------------------------       
        HashTable hashTable = new HashTable(200000);
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashTable.insert("LAB TA");
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("hashTable insert 1000: " + estimatedTime  + " ns");

        
        HashTable hashTable1 = new HashTable(200000);
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            hashTable1.insert("LAB TA");
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("hashTable insert 10000: " + estimatedTime1 + " ns");

        
        HashTable hashTable2 = new HashTable(200000);
        long startTime2 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            hashTable2.insert("LAB TA");
        }
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("hashTable insert 100000: " + estimatedTime2 + " ns");

        
        HashTable hashTable3 = new HashTable(200000);
        long startTime3 = System.nanoTime();
        for (int i = 0; i < 200000; i++) {
            hashTable3.insert("LAB TA");
        }
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println("hashTable insert 200000: " + estimatedTime3 + " ns");
        
//find--------------------------------------------------------------------------

        long startTime4 = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            hashTable.find("LAB TA");
        }
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println("hashTable find 1000: " + estimatedTime4 + " ns");
        
        
        long startTime5 = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            hashTable1.find("LAB TA");
        }
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println("hashTable find 10000: " + estimatedTime5 + " ns");
        
        
        long startTime6 = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            hashTable2.find("LAB TA");
        }
        long estimatedTime6 = System.nanoTime() - startTime6;
        System.out.println("hashTable find 100000: " + estimatedTime6 + " ns");
        
        
        long startTime7 = System.nanoTime();
        for (int i = 0; i < 500; i++) {
            hashTable3.find("LAB TA");
        }
        long estimatedTime7 = System.nanoTime() - startTime7;
        System.out.println("hashTable find 200000: " + estimatedTime7 + " ns");
        
//Tree insert--------------------------------------------------------------------------        
        AVL<Integer, Integer> AVLtree = new AVL<>();
        long startTime8 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            AVLtree.add(i, i);
        }
        long estimatedTime8 = System.nanoTime() - startTime8;
        System.out.println("Tree add 1000: " + estimatedTime8 + " ns");
        
       AVL<Integer, Integer> AVLtree1 = new AVL<>();
        long startTime9 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            AVLtree1.add(i, i);
        }
        long estimatedTime9 = System.nanoTime() - startTime9;
        System.out.println("Tree add 10000: " + estimatedTime9 + " ns");
        
        AVL<Integer, Integer> AVLtree2 = new AVL<>();
        long startTime10 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            AVLtree2.add(i, i);
        }
        long estimatedTime10 = System.nanoTime() - startTime10;
        System.out.println("Tree add 100000: " + estimatedTime10 + " ns");
        
        AVL<Integer, Integer> AVLtree3 = new AVL<>();
        long startTime11 = System.nanoTime();
        for (int i = 0; i < 200000; i++) {
            AVLtree3.add(i, i);
        }
        long estimatedTime11 = System.nanoTime() - startTime11;
        System.out.println("Tree add 200000: " + estimatedTime11 + " ns");
        
//find--------------------------------------------------------------------------
        long startTime12 = System.nanoTime();
        for (int i = 0; i < 500; i++) {            
        AVLtree.get(100);
        }
        long estimatedTime12 = System.nanoTime() - startTime12;
        System.out.println("Tree search 1000: " + estimatedTime12 + " ns");
        
        long startTime13 = System.nanoTime();
        for (int i = 0; i < 500; i++) {  
        AVLtree1.get(100);
        }
        long estimatedTime13 = System.nanoTime() - startTime13;
        System.out.println("Tree search 10000: " + estimatedTime13 + " ns");
        
        long startTime14 = System.nanoTime();
        for (int i = 0; i < 500; i++) {  
        AVLtree2.get(100);
        }
        long estimatedTime14 = System.nanoTime() - startTime14;
        System.out.println("Tree search 100000: " + estimatedTime14 + " ns");
        
        long startTime15 = System.nanoTime();
        for (int i = 0; i < 500; i++) {  
        AVLtree3.get(100);
        }
        long estimatedTime15 = System.nanoTime() - startTime15;
        System.out.println("Tree search 200000: " + estimatedTime15 + " ns");
    }

}
