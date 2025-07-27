public class Stack {
    int [] arr = new int[50];
    int count;

    void push(int x){
        arr[count++] = x;
    }

    int pop(){
        return arr[--count];
    }

    public String toString(){
        if (arr == null) {return "null";}
        if (arr.length == 0) {return "[]";}
        String res = "[";
        for(int i = 0; i < count - 1; i++){
            res+=arr[i] + ",";
        }
        return res + arr[count - 1] + "]";
    }
}