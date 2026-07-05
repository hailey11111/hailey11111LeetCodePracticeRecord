public class Main {
    public static void main(String[] args) {
        SqListClass<String> sqList= new SqListClass<>();
        String[]arr={"葡萄","香蕉","榴莲","水蜜桃","椰子"};
        sqList.CreateList(arr);
        for(int i=0; i<sqList.getSize(); i++){
            System.out.print(sqList.get(i) + " ");
        }
    }
}