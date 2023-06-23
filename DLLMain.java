public class DLLMain {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addLast(10);
        dll.addLast(100);
        dll.addLast(34);
        dll.addLast(20);
        dll.addLast(200);
        dll.addLast(75);
        dll.print();

        //cek fungsi toArray()
        int[] arr = dll.toArray();
        for(int x : arr){
            System.out.print(x + ",");
        }
        
        //cek fungsi sublist()
        System.out.println(" ");
        DLL subList = dll.sublist(1, 3);
        subList.print();
        
        //cek fungsi addAll()
        DLL dll2 = new DLL();
        dll2.addLast(212);
        dll2.addLast(212);
        dll2.addLast(212);
        dll.addAll(dll2);
        dll.print();
        
        //cek fungsi containAll
        DLL dll3 = new DLL();
        dll3.addLast(100);
        dll3.addLast(34);
        dll3.addLast(212);
        System.out.println(""+dll.containsAll(dll3));
        
        //cek fungsi removeAll()
        dll.removeAll(dll3);
        dll.print();
    }
}
