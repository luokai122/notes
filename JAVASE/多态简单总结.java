JAVA中的多态可以理解多：事物存在的多种体现形态。
1，多态的基本体现
    父类名  对象名 = new 子类名();
    父类的引用指向了自己的子类对象。这就是多态的代码体现。 
    父类的引用也可以接收自己的子类对象。
2，多态的前提
    必须是类与类之间有关系。要么继承，要么实现。
    通常还有一个前提。就是存在覆盖！
3，多态的好处
   多态的出现大大的提高了程序的扩展性。
4，多态的应用
    
5，多态的弊端
    提高了拓展性。但是只能使用父类的引用访问父类中的成员。
5，多态的出现代码中的特点（多态的注意事项）
    
        简单总结。成员函数（非静态）在多态调用时
编译看父类。运行看子类！
在多态中、成员变量的特点！
        如果编译和运行。都参考（引用型变量所属的类）
静态函数
在多态中。静态成员函数的特点：
无论编译和运行都参考左边（引用型变量所属的类）

--------------------------------------------------
Fu f = new Zi();
多态中，成员函数（非静态）的特点：
     在编译时期：参阅引用型变量所属的类中是否有调用的方法如果有，编译通过。如果没有，编译失败！ 
在运行时期：参阅对象所属的类中是否有调用的方法！ 
 简单总结：成员函数在多态调用时。编译看左边。运行看右边！
-------------面试答题
多态中，成员函数（静态）的特点：
     无论编译和运行都参考左边。
多态中，成员变量的特点：
     不论编译还是运行都看左边！也就是引用型变量所属的类！