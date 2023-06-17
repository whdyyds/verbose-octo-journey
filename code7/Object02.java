Person a = new Person();
a.age = 10;
a.name = "小明";
Person b;
b = a;//b指向a
System.out.println(b.name);//小明
b.age = 200;//指向的对象更改为200
b = null;//地址清空，指针被切断
System.out.println(a.age);//200
System.out.println(b.age);//会出现异常