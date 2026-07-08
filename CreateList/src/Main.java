//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //尾部插入
        Integer[]arr={1,2,3,4,5};
        SqListClass<Integer> Sq1 =new SqListClass<>();
        Sq1.CreateList(arr);
        Sq1.Add(100);
        System.out.println(Sq1.toString());
        System.out.printf("顺序表逆置后：");
        Sq1.reverse();
        System.out.println(Sq1.toString());
        //拼接

        String[]china={"我","爱","中国"};
        SqListClass<String>Sq2=new SqListClass<>();
        Sq2.CreateList(china);
        System.out.printf(Sq2.toString());

        //
    }

}