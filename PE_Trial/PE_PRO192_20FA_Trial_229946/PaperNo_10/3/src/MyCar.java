
import java.util.Comparator;
import java.util.List;

public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        int sumRate = 0;
        // Duyet tung phan tu trong danh sach t
        for (Car car : t) {
            sumRate += car.getRate();
        }
        return sumRate/t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int max = indexMax(t);
        int min = indexMin(t);
        Car temp = t.get(min);
        t.set(min, t.get(max));
        t.set(max, temp);
    }
    public int indexMin(List<Car> t){
        int minRate =t.get(0).getRate();
        int indexMinRate=0;
        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).getRate()<minRate){
                minRate = t.get(i).getRate();
                indexMinRate = i;
            }
        }
        return indexMinRate;
    }
    public int indexMax(List<Car> t){
        int maxRate=t.get(0).getRate();
        int indexMaxRate=0;
        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).getRate()>maxRate){
                maxRate = t.get(i).getRate();
                indexMaxRate = i;
            }
        }
        return indexMaxRate;
    }

    @Override
    public void f3(List<Car> t) {
        t.sort(new Comparator<Car>(){
            @Override
            public int compare(Car o1, Car o2) {
                int res = o1.getMaker().compareTo(o2.getMaker());
                if(res==0){ // Maker giong nhau
                    return o1.getRate() > o2.getRate() ? -1 : o1.getRate() < o2.getRate() ? 1 : 0;
                }else
                    return res;
            }
        });
    }
    
}
