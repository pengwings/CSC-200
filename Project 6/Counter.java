/**
 * Created by byu on 7/2/2017.
 */
public class Counter {
    int count;
    public Counter(){
    }
    public void counterZero(int count){
        count = 0;
    }
    public void addOne(){
        count++;
    }
    public void minusOne(){
        if(count>0){
            count--;
        }
    }
    public int getCount() {
        return count;
    }
    public void printCount(){
        System.out.println(count);
    }
}
