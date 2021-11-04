由于子类不能继承父类的构造方法，因此，如果要调用父类的构造方法，可以使用 super 关键字。super 可以用来访问父类的构造方法、普通方法和属性。

super 关键字的功能：

    在子类的构造方法中显式的调用父类构造方法
    访问父类的成员方法和变量。
 例1
声明父类 Person 和子类 Student，在 Person 类中定义一个带有参数的构造方法，代码如下：

    public class Person {
        public Person(String name) {
        }
    }
    public class Student extends Person {
    }

会发现 Student 类出现编译错误，提示必须显式定义构造方法，错误信息如下：

Implicit super constructor Person() is undefined for default constructor. Must define an explicit constructor
在本例中 JVM 默认给 Student 类加了一个无参构造方法，而在这个方法中默认调用了 super()，但是 Person 类中并不存在该构造方法，所以会编译错误。

如果一个类中没有写任何的构造方法，JVM 会生成一个默认的无参构造方法。在继承关系中，由于在子类的构造方法中，第一条语句默认为调用父类的无参构造方法（即默认为 super()，一般这行代码省略了）。所以当在父类中定义了有参构造方法，但是没有定义无参构造方法时，编译器会强制要求我们定义一个相同参数类型的构造方法。
例2