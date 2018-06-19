# KotlinLessons
Kotlin入门到进阶

第1章 课程介绍（需具备Java基础）<br>
本章主要介绍什么是Kotlin，课程安排，以及开发环境的配置。项目实战移步-->《Kotlin打造完整电商APP 模块化+MVP+主流框架》：http://coding.imooc.com/class/166.html<br>

1-1 课程导学<br>
1-2 什么是Kotlin？<br>
第2章 数据类型（难度系数：☆）<br>
本章主要讲解 Kotlin 的基本词法，从类型系统入手为大家介绍 Kotlin 中都存在哪些类型，以及相关的特性。（知识点：基本类型、类与对象、空类型、智能类型转换、包、区间、数组）<br>

2-1 Boolean数据类型<br>
2-2 Number数据类型<br>
2-3 拆箱装箱与Char数据类型<br>
2-4 基础数据类型转换与字符串<br>
2-5 类和对象<br><br>
2-6 空类型和智能类型转换<br>
2-7 包（package)<br>
2-8 区间（Range）<br>
2-9 数组（Array）<br>
第3章 程序结构（难度系数：☆☆）<br>
本章主要讲解 Kotlin 的句法，从程序结构入手为大家介绍 Kotlin 有哪些表达式，有哪些语句，如何定义常量、变量以及函数等等。（知识点：常量与变量 、函数、Lambda表达式、类成员、运算符、分支表达式、循环语句、异常捕获 、函数的具名参数、函数的变长参数、函数的默认参数、案例：一个命令行计算器、导出可执行程...<br>

3-1 常量与变量(val,var)<br>
3-2 函数（function）<br>
3-3 Lambda表达式<br>
3-4 类成员（成员方法、成员变量）<br>
3-5 基本运算符<br>
3-6 表达式（中缀表达式，分支表达式，when表达式等）<br>
3-7 循环语句（for循环，while循环，continue,break）<br>
3-8 异常捕获(try,catch,finally)<br>
3-9 具名参数，变长参数，默认参数<br>
3-10 小案例：命令行计数器开发<br>
3-11 导出可执行程序<br>

第4章 面向对象（难度系数：☆☆）
本章深入探讨 Kotlin 的面向对象的知识，包括抽象、继承，扩展成员、属性代理以及常见类的概念及特性。（知识点：面向对象的基本概念、抽象类与接口、 子承父业的故事、类及其成员的可见性、object、伴生对象与静态成员、方法重载和默认参数、扩展成员、属性代理、数据类、内部类、枚举、密封类）...

4-1 面向对象-抽象类与接口（abstract,interface）
4-2 子承父业-继承1
4-3 子承父业-继承2
4-4 类及其成员的可见性（private,protected,internal,public）
4-5 object
4-6 伴生对象与静态成员
4-7 方法重载与默认参数
4-8 扩展成员
4-9 属性代理
4-10 数据类(allOpen,noArg插件，再见，javaBean)
4-11 内部类(this@Outter,this@Inner)
4-12 枚举（enum）
4-13 密封类(sealed Class)

第5章 高阶函数（难度系数：☆☆☆☆）
本章深入探讨 Kotlin 的高阶函数的知识，学习常见的内置高阶函数的用法，并对常见高阶函数的相关概念如闭包、复合、柯里化等做简要介绍。（知识点：基本概念、常见高阶函数、尾递归优化、闭包、函数复合、 Currying、 偏函数、一个统计字符个数的小例子）...

5-1 高阶函数的基本概念
5-2 常见高阶函数（forEach,map,flatmap,fold,reduce,filter,takeWhile,let,apply,with,use）-1
5-3 常见高阶函数（forEach,map,flatmap,fold,reduce,filter,takeWhile,let,apply,with,use）-2
5-4 尾递归优化 (tailrec)
5-5 闭包(函数式编程的福音)
5-6 函数复合（f(g(x)),infix）
5-7 柯里化（Currying）-函数调用链
5-8 偏函数
5-9 小案例：统计字符串个数程序开发

第6章 领域特定语言 DSL（难度系数：☆☆☆）
本章介绍领域特定语言 DSL 的概念，以及如何使用 Kotlin 编写 DSL。（知识点：DSL 的基本概念、案例：HTML DSL、Gradle Kotlin 脚本）

6-1 DSL 的基本概念
6-2 小案例：HTML DSL开发
6-3 Gradle Kotlin 脚本编写
第7章 协程 Coroutine（难度系数：☆☆☆☆☆）
本章介绍 Kotlin 的协程，主要包括基本 API 的使用，协程执行流程的分析，以及协程相关应用的案例和框架介绍。（知识点：基本概念、案例：异步下载图片、 协程的原理剖析、序列生成器、Kotlinx.coroutines框架简介）

7-1 协程的基本概念
7-2 案例：异步下载图片1
7-3 案例：异步下载图片2
7-4 案例：异步下载图片3
7-5 协程的原理剖析
7-6 小案例：序列生成器
7-7 Kotlinx.coroutine框架介绍
7-8 本章小结

第8章 反射语法与库（难度系数：☆☆☆）
本章会为大家讲解Java反射，Kotlin反射，Kotlin反射库以及注意事项。

8-1 Kotlin中使用 Java 反射-1
8-2 Kotlin中使用 Java 反射-2
8-3 Kotlin中使用 Kotlin 反射-1
8-4 Kotlin中使用 Kotlin 反射-2
8-5 Kotlin中使用 Kotlin 反射-3
8-6 Kotlin 反射库的注意事项

第9章 泛型，型变，星投影（难度系数：☆☆☆☆）
本章将为大家讲解Kotlin中的泛型基本语法，实现机制，型变以及星投影，最后会带大家用泛型实现MVP绑定案例。

9-1 泛型的基本语法-1
9-2 泛型的基本语法-2
9-3 泛型的实现机制
9-4 型变-1
9-5 型变-2
9-6 星投影
9-7 小案例：泛型实现一个MVP框架

第10章 Kotlin与 Java 混合开发（难度系数：☆☆）
本章主要对 Kotlin 与 Java 混合开发常见的问题进行了梳理。（知识点：基本互操作、SAM转换、正则表达式、集合框架、IO操作、装箱和拆箱、注解处理器）

10-1 基本互操作
10-2 SAM 转换
10-3 正则表达式
10-4 集合框架
10-5 IO 操作
10-6 装箱和拆箱
10-7 注解处理器
10-8 本章小结

第11章 Kotlin小案例展示与Kotlin未来展望（难度系数：☆☆☆）
本章主要通过5个小案例为大家演示如何编写 Kotlin 脚本，如何开发服务端程序， 如何开发 Android 应用，如何开发前端程序，以及如何使用 Kotlin-Native 将 Kotlin 直接编译为可执行程序并在操作系统上直接运行。（知识点：Kotlin的应用场景、 Kotlin-Script的例子、Kotlin-Android的例子、Kotlin-JavaScript的例...

11-1 Kotlin的应用与展望概要
11-2 小案例：Kotlin-Script 脚本编写
11-3 小案例：Kotlin-Android 项目开发
11-4 小案例：Kotlin-JavaScript前端项目开发
11-5 小案例：Kotlin-SpringBoot服务端项目开发
11-6 小案例：Kotlin-Native项目开发

第12章 Kotlin1.2跨平台新特性示例（难度系数：☆☆☆）
本章会为大家讲解Kotlin1.2版本中跨平台新特性，然后为大家讲解在JVM，Android，Web前端，NodeJs中应用跨平台新特性，让大家紧跟Kotlin新技术，走在时代前沿，做新一代Android开发工程师。

12-1 跨平台项目的概念
12-2 跨平台工程的构建
12-3 Jvm程序示例
12-4 Android 程序示例
12-5 Web 前端程序示例
12-6 NodeJs程序示例
12-7 Kotlin最新支持Native跨平台尝鲜
12-8 本章小结
