####异或图形表示  

![img.png](img.png)  
```html
两个数不使用临时变量交换方法
A,B交换
A=A^B（a^b）；
B=B^A（b^a^b=a）；
A=A^B（a^b^a=b）
```