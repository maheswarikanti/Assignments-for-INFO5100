public class ExceptionDriver {

    static void printArray() throws MyIndexOutOfBoundException {
        int ar[] = {1, 2, 3, 4, 5, 7, 8, 9, 10 };
        for (int i = 0; i <= ar.length; i++){
            if(i==ar.length)
            {
                throw new MyIndexOutOfBoundException("Index: " + (ar.length + 1) + ", but Lower bound: 0 , Upper bound :" + ar.length);
            }
        }

    }
    public static void main(String[] args) {
        try {
            printArray();
        }
        catch(MyIndexOutOfBoundException ex)
        {
            System.out.println(ex);
        }
    }
}
