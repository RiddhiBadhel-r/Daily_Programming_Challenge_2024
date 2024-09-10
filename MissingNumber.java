public class MissingNumber {

    public static void main(String[] args) {

        int a[] = {1,2,4,5};

        int n = a.length + 1;
        
        int totalsum = n * (n + 1) / 2;
        int restsum = 0;
        
        for (int i : a) {
            restsum = restsum + i;
        }
        int missingnumber =  totalsum - restsum;
        System.out.println("Missing number: " + missingnumber);
    }
}
