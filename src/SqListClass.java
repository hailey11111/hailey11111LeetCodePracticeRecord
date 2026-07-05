//建立一个顺序表的基本代码
//顺序表泛型类
public class SqListClass<E> {
    final int initcapacity = 10;
    private int capacity;
    private int size;
    private E[] data;
    public SqListClass() {
        data = (E[]) new Object[initcapacity];
        size = 0;
        capacity=initcapacity;
    }

    //扩容
    public void updateCapacity(int newcapacity) {
        capacity = newcapacity;
        E[] newdata;
        newdata = (E[]) new Object[newcapacity];
        for (int i = 0; i < size; i++) {
            newdata[i] = data[i];
        }
        data = newdata;
    }

    //创建顺序表
    public void CreateList(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (size == capacity) {
                updateCapacity(2 * size);
            }
            data[size] = arr[i];//这里是data[size]不是data[i]
            size++;
        }
    }
//封装data,通过get统一读取；防止类型转换出错
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标越界");
        }
        return (E) data[index];
    }
    //获取顺序表长度
    public int getSize(){
        return size;
    }
}