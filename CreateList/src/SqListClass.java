public class SqListClass <E>{
    private int initcapacity=10;
    private  int capacity;
    private  int size;
    private E[] data;
    public SqListClass(){
        data=(E[]) new Object[initcapacity];
        size=0;
        capacity=initcapacity;
    }
    //改变容量
    public void updatecapacity(int newcapacity){
        E[] newdata=(E[]) new Object[newcapacity];
        for (int i = 0; i < size; i++) {
            newdata[i]=data[i];
        }
        capacity=newcapacity;
        data=newdata;
    }
    //批量填入
    public void CreateList(E[]arr){
        size=0;
        for (int i = 0; i < arr.length; i++) {
            if (size == capacity) {
                updatecapacity(2*size);
            }
            data[size]=arr[i];
            size++;
        }
    }
    //尾部添加
    public void Add(E e){
        data[size]=e;
        size++;
    }
    //求线性表长度
    public int getSize(){
        return size;
    }
    //设置线性表长度
    public void SetSize(int nlen){
        size=nlen;
    }
    //求序号为i的元素
    public E GetElem(int i){
        if (i<0||i>size-1) {
           throw new IllegalArgumentException("i不是有效范围") ;
        }
        return (E)data[i];
    }
    //设置序号为i的元素的值
    public void SetElem(int i,E e){
        if (i<0||i>size-1) {
            throw new IllegalArgumentException("i不是有效范围");
        }
         data[i]=e;
    }
    //求线性表中第一个值为e的元素的序号
    public int GetNo(E e){
        int i=0;
        while(i<size&&!data[i].equals(e)){
            i++;
        }
        if (i >=size) {
            return -1;
        }
        return i;
    }
    //序号为i,j的元素的值进行交换
    public void swap(int i,int j){
        E temp=data[i];
        data[i]=data[j];
        data[j]=temp;
    }
    //插入元素e作为第i个元素
    public void Insert(int i,E e){
        if (i <0||i>size) {
            throw new IllegalArgumentException("i不在有效范围");
        }
        if (size == capacity) {
            updatecapacity(2*size);
        }
        for (int j=size;j>i;j--){
            data[j]=data[j-1];
        }
        data[i]=e;
        size++;
    }
    //删除第i个元素
    public void Delete(int i){
        if (i<0||i>size-1) {
            throw new IllegalArgumentException("i不在有效范围");
        }
        for (int j=i;j<size-1;j++){
            data[j]=data[j+1];
        }
        size--;
        if (capacity>initcapacity&&size==capacity/4) {
            updatecapacity(capacity/2);
        }
    }
    public String toString(){
        String ans="";
        for (int i = 0; i < size; i++) {
            ans+=data[i].toString()+" ";
        }
        return ans;
    }
    //顺序表逆置
    public void reverse(){
        int i=0;
        int j=size-1;
        while (i<j){
            swap(i,j);
            i++;
            j--;
        }
    }
    //顺序表交换最大值和最小值

}
